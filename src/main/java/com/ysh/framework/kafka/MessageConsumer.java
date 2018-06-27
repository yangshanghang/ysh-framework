package com.ysh.framework.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

/**
 * kafka消息消费者
 *
 * @author YangShangHang
 * @date 2018/6/27
 */
public class MessageConsumer implements MessageListener<String, String> {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    /**
     * 消息处理
     *
     * @param data 消息数据
     */
    @Override
    public void onMessage(ConsumerRecord<String, String> data) {
        logger.info("==============================" + data.topic() + " - " + data.value());
    }
}
