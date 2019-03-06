package com.quicker.sana.mqjob.job;


import com.quicker.sana.mqjob.common.IDUtils;
import com.quicker.sana.mqjob.mapper.JobConfigMapper;
import com.quicker.sana.mqjob.mapper.JobDetailsMapper;
import com.quicker.sana.mqjob.mapper.JobRecordMapper;
import com.quicker.sana.mqjob.pojo.JobDetails;
import com.quicker.sana.mqjob.pojo.JobRecord;
import com.quicker.sana.mqjob.pojo.ProviderResult;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

/***
 * @author 周继文
 * @date 2019/3/5 10:53
 * @ersion 1.0.0
 */
@Component
public class PkAwardListener {

    @Autowired
    JobDetailsMapper jobDetailsMapper;

    @Autowired
    JobConfigMapper jobConfigMapper;

    @Autowired
    JobRecordMapper jobRecordMapper;

    @RabbitListener(queues = "first-queue")
    public void sendCard(ProviderResult providerResult) {
        System.out.println("aaaaaaaaaaaaa");
        String classPath = providerResult.getClassPath();

        String methodName = providerResult.getMethodName();

        try {
            Class<?> aClass = Class.forName(classPath);
            Object o = aClass.newInstance();

            Method declaredMethod = aClass.getDeclaredMethod(methodName, ProviderResult.class);
            Object result = declaredMethod.invoke(o, providerResult);

            //新增detai
            insertDetail(providerResult.toString(), result);

            ProviderResult resultObj = null;
            if (result instanceof ProviderResult) {
                resultObj = (ProviderResult) result;
            }

            if (resultObj != null) {
                if (!resultObj.getSucceed()) {
                    insertRecord(providerResult.toString(), result);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void insertRecord(String s, Object invoke) {
        JobRecord jobRecord = new JobRecord();
        jobRecord.setJobRecordCode(IDUtils.getId());
        jobRecord.setCreateTime(new Date());
        jobRecord.setDoneTime(new Date());
        jobRecord.setLastJobRequest(s);
        jobRecord.setLastJobResponse(invoke.toString());
        jobRecord.setStatus(3);
        jobRecord.setJobType("1");
        jobRecordMapper.insertSelective(jobRecord);
    }

    private int insertDetail(String request, Object result) {
        JobDetails jobDetails = new JobDetails();
        jobDetails.setCreatetime(new Date());
        jobDetails.setJobDetailCode(IDUtils.getId());
        jobDetails.setJobRequest(request);
        jobDetails.setJobResponse(result.toString());
        return jobDetailsMapper.insertSelective(jobDetails);
    }
}
