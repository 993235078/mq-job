package com.quicker.sana.mqjob.provider;


import com.quicker.sana.mqjob.pojo.ProviderResult;

/***
 * @PackageName com.quicker.sana
 * @ClassName AwProvider
 * @author 周继文
 * @Date 2019/3/5 11:20
 * @Version 1.0.0
 */
public class AwProvider {

    public ProviderResult testAw(ProviderResult providerResult) {

        if (providerResult.getSucceed()) {
            System.out.println(providerResult.getSomething());
            providerResult.setSucceed(false);
            return providerResult;
        }
        return providerResult;
    }

}
