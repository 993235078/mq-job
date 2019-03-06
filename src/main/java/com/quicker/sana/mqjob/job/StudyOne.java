package com.quicker.sana.mqjob.job;

import com.quicker.sana.mqjob.pojo.ProviderResult;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * @PackageName com.quicker.sana.mqjob.job
 * @ClassName StudyOne
 * @author 周继文
 * @Date 2019/3/5 18:59
 * @Version 1.0.0
 */

@Component
public class StudyOne {

    //@RabbitListener(queues = "first-queue")
    public void t1(ProviderResult providerResult) {
        System.out.println(providerResult.toString());
    }


    //@RabbitListener(queues = "second-queue")
    public void t2(String message) {
        System.out.println(message);
    }

}
