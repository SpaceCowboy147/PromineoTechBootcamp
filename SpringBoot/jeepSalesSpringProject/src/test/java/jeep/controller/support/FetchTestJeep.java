package jeep.controller.support;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;

import jeep.entity.Jeep;
import jeep.entity.jeepModel;

public class FetchTestJeep  extends baseTest {
	protected List<Jeep> buildExpected() {
		List<Jeep> list = new LinkedList<>();
		
		list.add(Jeep.builder()
				.modelId(jeepModel.WRANGLER)
				.trimLevel("Sport")
				.numDoors(4)
				.wheelSize(17)
				.basePrice(new BigDecimal("31975.00"))
				.build());
		
		
		list.add(Jeep.builder()
				.modelId(jeepModel.WRANGLER)
				.trimLevel("Sport")
				.numDoors(2)
				.wheelSize(17)
				.basePrice(new BigDecimal("28475.00"))
				.build());
	
		Collections.sort(list);
		return list;
}
	protected void assertErrorMessageValid(Map<String, Object> error, 
			HttpStatus status) {
		assertThat(error)
		 .containsKey("message")
		 .containsEntry("Status code", status.value())
		 .containsEntry("uri", "/jeeps")
		 .containsKey("timestamp")
		 .containsEntry("reason", status.getReasonPhrase());
}
}


