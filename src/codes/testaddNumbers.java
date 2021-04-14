package codes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		j_unit junit = new j_unit();
		int result= junit.addNumbers(101, 200);
		assertEquals(300,result);
	}

}
