package com.quicker.sana.mqjob.job;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/***
 * @author 周继文
 * @date 2019/3/5 10:52
 * @version 1.0.0
 */
public class AfterPayListener implements MessageListener {


    @Override
    public void onMessage(Message message) {

    }
}
