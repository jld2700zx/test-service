package org.lnut.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther ZhaoXin
 * @Date 2020/9/2
 */
//@Component
//@RabbitListener(queues = "direct")
@RestController
public class RabbitTest {

    @RequestMapping("/test.config")
    public String rabbitReceive(@Value("${server.port}") String msg) {
        return msg;
    }




}
