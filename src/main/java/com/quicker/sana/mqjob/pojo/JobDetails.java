package com.quicker.sana.mqjob.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobDetails implements Serializable {

     /**
     * 任务request
     */
    private String jobRequest;

     /**
     * 任务流水id
     */
    private String jobDetailCode;

     /**
     * 创建时间
     */
    private Date createtime;

     /**
     * 任务类型
     */
    private Integer jobType;

     /**
     * 任务response
     */
    private String jobResponse;


    private static final long serialVersionUID = 1L;

    public String getJobRequest() {
        return jobRequest ;
    }

    public void setJobRequest(String jobRequest) {
        this.jobRequest = jobRequest ;
    }

    public String getJobDetailCode() {
        return jobDetailCode ;
    }

    public void setJobDetailCode(String jobDetailCode) {
        this.jobDetailCode = jobDetailCode ;
    }

    public Date getCreatetime() {
        return createtime ;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime ;
    }

    public Integer getJobType() {
        return jobType ;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType ;
    }

    public String getJobResponse() {
        return jobResponse ;
    }

    public void setJobResponse(String jobResponse) {
        this.jobResponse = jobResponse ;
    }




}