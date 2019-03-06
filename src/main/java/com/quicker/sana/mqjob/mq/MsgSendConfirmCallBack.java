package com.quicker.sana.mqjob.mq;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/***
 * @PackageName com.quicker.sana.mqjob.mq
 * @ClassName MsgSendConfirmCallBack
 * @author 周继文
 * @Date 2019/3/5 17:38
 * @Version 1.0.0
 */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        System.out.println("MsgSendConfirmCallBack  , 回调id:" + correlationData);
        if (b) {
            System.out.println("消息消费成功");
        } else {
            System.out.println("消息消费失败:" + s + "\n重新发送");
        }
    }
}
