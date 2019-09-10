package beard.red.dataprocessor;

import beard.red.dataprocessor.kafka.MessageProducer;
import beard.red.dataprocessor.restclient.services.ApiService;
import beard.red.dataprocessor.restclient.services.ApiServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataprocessorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataprocessorApplication.class, args);

		MessageProducer producer = context.getBean(MessageProducer.class);
		ApiService service = context.getBean(ApiServiceImpl.class);

		service.getData().forEach(producer :: sendMessage);
	}

}
