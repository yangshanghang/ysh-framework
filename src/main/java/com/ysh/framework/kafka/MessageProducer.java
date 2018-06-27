package com.ysh.framework.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 描述: 消息生产者 .<br>
 *
 * @author YangShangHang
 * @date 2018/6/27
 */
@Component
public class MessageProducer {

    /**
     * kafka模板注入
     */
    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    /**
     * 向kafka队列中发送内容（生产者）
     *
     * @param content
     * @throws Exception
     */
    public void kafkaSend(String content) throws Exception{
        kafkaTemplate.send("ysh-topic", content);
    }
}
