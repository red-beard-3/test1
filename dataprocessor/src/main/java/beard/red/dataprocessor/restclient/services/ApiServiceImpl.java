package beard.red.dataprocessor.restclient.services;

import beard.red.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class ApiServiceImpl implements ApiService {
	private RestTemplate restTemplate;
	private String apiUrl;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${url}")String apiUrl) {
		this.restTemplate = restTemplate;
		this.apiUrl = apiUrl;
	}

	@Override
	public List<Data> getData() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(apiUrl);
		ExchangeData data = restTemplate.getForObject(builder.toUriString(), ExchangeData.class);

		return data.getData();
	}

//	private ExchangeData getData1() {
//		ExchangeData exchangeData = new ExchangeData();
//		List<Data> list = new ArrayList<>();
//		Data data = new Data();
//		Securities securities = new Securities();
//		Metadata metadata = new Metadata();
//		Id id = new Id();
//		id.setType("1");
//		metadata.setId(id);
//		securities.setMetadata(metadata);
//		data.setSecurities(securities);
//		list.add(data);
//		exchangeData.setData(list);
//
//		return exchangeData;
//	}
}
