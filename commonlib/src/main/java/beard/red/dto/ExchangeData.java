package beard.red.dto;

import java.util.ArrayList;
import java.util.List;

public class ExchangeData {
		private List<Data> data = new ArrayList<>();

		public List<Data> getData() {
			return data;
		}

		public void setData(List<Data> data) {
			this.data = data;
		}
}
