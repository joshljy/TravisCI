package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlatRateDiscount {

	@Test
	public void test() {
		float discountedPrice = 8.0f;
		FlatRateDiscountStrategy s = new FlatRateDiscountStrategy(2.0f);

		assertEquals(discountedPrice, s.applyDiscount(10.0f), 1.0f);
	}


}
