package codes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
	void test() {
		j_unit junitstring = new j_unit();
		String result= junitstring.addStrings("cap", "project");
		assertEquals("capproject",result);
	}

}
