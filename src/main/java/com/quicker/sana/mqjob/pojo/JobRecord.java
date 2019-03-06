package com.quicker.sana.mqjob.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobRecord implements Serializable {

     /**
     * 任务状态：1:未执行 2进行中 3：已完成
     */
    private Integer status;

     /**
     * 任务创建时间
     */
    private Date createTime;

     /**
     * 队列名字
     */
    private String mqQueues;

     /**
     * 最后一次请求的返回信息
     */
    private String lastJobResponse;

     /**
     * 最后一次请求的请求信息
     */
    private String lastJobRequest;

     /**
     * routingKey名字
     */
    private String mqRoutingKey;

     /**
     * 任务完成时间
     */
    private Date doneTime;

     /**
     * 交换机名字
     */
    private String mqExchange;

     /**
     * 备注字段1
     */
    private String markOne;

     /**
     * 记录主键
     */
    private String jobRecordCode;

     /**
     * 任务修改时间
     */
    private Date updateTime;

     /**
     * 任务类型
     */
    private String jobType;

     /**
     * 备注字段2
     */
    private Integer markTwo;


    private static final long serialVersionUID = 1L;

    public Integer getStatus() {
        return status ;
    }

    public void setStatus(Integer status) {
        this.status = status ;
    }

    public Date getCreateTime() {
        return createTime ;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime ;
    }

    public String getMqQueues() {
        return mqQueues ;
    }

    public void setMqQueues(String mqQueues) {
        this.mqQueues = mqQueues ;
    }

    public String getLastJobResponse() {
        return lastJobResponse ;
    }

    public void setLastJobResponse(String lastJobResponse) {
        this.lastJobResponse = lastJobResponse ;
    }

    public String getLastJobRequest() {
        return lastJobRequest ;
    }

    public void setLastJobRequest(String lastJobRequest) {
        this.lastJobRequest = lastJobRequest ;
    }

    public String getMqRoutingKey() {
        return mqRoutingKey ;
    }

    public void setMqRoutingKey(String mqRoutingKey) {
        this.mqRoutingKey = mqRoutingKey ;
    }

    public Date getDoneTime() {
        return doneTime ;
    }

    public void setDoneTime(Date doneTime) {
        this.doneTime = doneTime ;
    }

    public String getMqExchange() {
        return mqExchange ;
    }

    public void setMqExchange(String mqExchange) {
        this.mqExchange = mqExchange ;
    }

    public String getMarkOne() {
        return markOne ;
    }

    public void setMarkOne(String markOne) {
        this.markOne = markOne ;
    }

    public String getJobRecordCode() {
        return jobRecordCode ;
    }

    public void setJobRecordCode(String jobRecordCode) {
        this.jobRecordCode = jobRecordCode ;
    }

    public Date getUpdateTime() {
        return updateTime ;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime ;
    }

    public String getJobType() {
        return jobType ;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType ;
    }

    public Integer getMarkTwo() {
        return markTwo ;
    }

    public void setMarkTwo(Integer markTwo) {
        this.markTwo = markTwo ;
    }




}