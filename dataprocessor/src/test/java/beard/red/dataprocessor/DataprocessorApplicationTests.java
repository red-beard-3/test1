package beard.red.dataprocessor;

import beard.red.dataprocessor.kafka.MessageProducer;
import beard.red.dataprocessor.restclient.services.ApiService;
import beard.red.dataprocessor.restclient.services.ApiServiceImpl;
import beard.red.dto.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataprocessorApplicationTests {

	@Test
	public void contextLoads() {
	}

}
