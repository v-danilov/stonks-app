package app.stonks.manufacturer.bisness;

import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StonksManufacturingService implements IStonksManufacturingService {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "stonks_topic", groupId = "stonks-manufacturer")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }

}
