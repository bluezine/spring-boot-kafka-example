package kr.co.bluezine.kafka.producer;

import kr.co.bluezine.kafka.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.UUID;

@SpringBootTest
class SpringBootKafkaProducerApplicationTests {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void kafkaSendTest() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("test");
        kafkaTemplate.send("spring", user);
    }

    @Test
    void kafkaLargeSendTest() {
        for (int i = 0; i < 100000; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName("test" + i);
            kafkaTemplate.send("spring", user);
        }
    }
}
