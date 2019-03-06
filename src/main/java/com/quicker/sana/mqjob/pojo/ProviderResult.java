package com.quicker.sana.mqjob.pojo;

import java.io.Serializable;

/***
 * @PackageName com.quicker.sana.pojo
 * @ClassName ProviderResult
 * @author 周继文
 * @Date 2019/3/5 11:21
 * @Version 1.0.0
 */
public class ProviderResult<T> implements Serializable {

    Boolean succeed;

    String something;

    String classPath;

    String methodName;

    T data;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    @Override
    public String toString() {
        return "ProviderResult{" +
                "succeed=" + succeed +
                ", something='" + something + '\'' +
                ", classPath='" + classPath + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }
}
