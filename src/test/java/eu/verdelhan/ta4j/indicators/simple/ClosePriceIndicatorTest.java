package eu.verdelhan.ta4j.indicators.simple;

import eu.verdelhan.ta4j.TimeSeries;
import eu.verdelhan.ta4j.mocks.MockTimeSeries;
import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class ClosePriceIndicatorTest {
	private ClosePriceIndicator closePrice;

	TimeSeries timeSeries;

	@Before
	public void setUp() {
		timeSeries = new MockTimeSeries();
		closePrice = new ClosePriceIndicator(timeSeries);
	}

	@Test
	public void testIndicatorShouldRetrieveTickClosePrice() {
		for (int i = 0; i < 10; i++) {
			assertThat(timeSeries.getTick(i).getClosePrice()).isEqualTo(closePrice.getValue(i));
		}
	}
}
