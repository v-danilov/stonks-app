package app.stonks.provider.bisness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StonksOrderService implements IStonksOrderService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProperties.Producer.class);
    private static final String TOPIC = "stonks_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void orderRandomStonk() {
        logger.info(String.format("#### -> Producing message -> %s", "henlo"));
        this.kafkaTemplate.send(TOPIC, "henlo");
    }
}
