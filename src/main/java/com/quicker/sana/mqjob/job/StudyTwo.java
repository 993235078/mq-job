package com.quicker.sana.mqjob.job;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * @PackageName com.quicker.sana.mqjob.job
 * @ClassName StudyTwo
 * @author 周继文
 * @Date 2019/3/5 19:51
 * @Version 1.0.0
 */

@Component
public class StudyTwo {

    @RabbitListener(queues = "second-queue")
    public void t2(String message) {
        System.out.println(message);
    }

}
