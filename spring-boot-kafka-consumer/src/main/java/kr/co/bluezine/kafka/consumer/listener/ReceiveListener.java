package kr.co.bluezine.kafka.consumer.listener;

import kr.co.bluezine.kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveListener {

    private static final Logger logger = LoggerFactory.getLogger(ReceiveListener.class);

    @KafkaListener(groupId="kafka-test", topics = "spring", containerFactory = "userListener")
    public void receive(User user) {
        logger.info("Receive Message ::: " + user.toString());
    }
}
