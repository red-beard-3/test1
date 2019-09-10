package beard.red.dataprocessor.kafka.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

public class KafkaTopicConfig {

	@Value("${kafka.bootstrapAddress}")
	private String bootstrapAddress;

	@Value("${kafka.topic.name}")
	private String topicName;

	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> config = new HashMap<>();
		config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);

		return new KafkaAdmin(config);
	}

	public NewTopic topic() {
		return new NewTopic(topicName, 1, (short) 1);
	}

}
