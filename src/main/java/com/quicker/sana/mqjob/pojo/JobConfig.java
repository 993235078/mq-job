package com.quicker.sana.mqjob.pojo;

import java.io.Serializable;
import java.util.Date;

public class JobConfig implements Serializable {

     /**
     * 可重试次数
     */
    private Integer retime;

     /**
     * 任务类型
     */
    private Integer jobType;

     /**
     * 创建时间
     */
    private Date createtime;

     /**
     * 修改时间
     */
    private Date updatetime;

     /**
     * 任务类
     */
    private String jobClass;

     /**
     * 任务名
     */
    private String jobName;

     /**
     * 状态1启用 2禁用
     */
    private Integer status;

     /**
     * 任务方法
     */
    private String jobMethod;


    private static final long serialVersionUID = 1L;

    public Integer getRetime() {
        return retime ;
    }

    public void setRetime(Integer retime) {
        this.retime = retime ;
    }

    public Integer getJobType() {
        return jobType ;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType ;
    }

    public Date getCreatetime() {
        return createtime ;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime ;
    }

    public Date getUpdatetime() {
        return updatetime ;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime ;
    }

    public String getJobClass() {
        return jobClass ;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass ;
    }

    public String getJobName() {
        return jobName ;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName ;
    }

    public Integer getStatus() {
        return status ;
    }

    public void setStatus(Integer status) {
        this.status = status ;
    }

    public String getJobMethod() {
        return jobMethod ;
    }

    public void setJobMethod(String jobMethod) {
        this.jobMethod = jobMethod ;
    }




}