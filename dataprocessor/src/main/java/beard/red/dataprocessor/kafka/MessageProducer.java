package beard.red.dataprocessor.kafka;

import beard.red.dto.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.slf4j.Logger;

@Slf4j
@NoArgsConstructor
@Component
public class MessageProducer {
	private static final Logger log = LoggerFactory.getLogger(MessageProducer.class);

	@Autowired
	private KafkaTemplate<String, Data> kafkaTemplate;
	@Value(value = "${kafka.topic.name}")
	private String topicName;

	public void sendMessage(Data data) {
		ListenableFuture<SendResult<String, Data>> future = kafkaTemplate.send(topicName, data);

		future.addCallback(new ListenableFutureCallback<SendResult<String, Data>>() {
			@Override
			public void onFailure(Throwable throwable) {
				log.error("Невозможно отправить данные {}", data);
			}

			@Override
			public void onSuccess(SendResult<String, Data> stringDataSendResult) {
				log.info("Данные отправлены {}", data);
			}
		});
	}
}
