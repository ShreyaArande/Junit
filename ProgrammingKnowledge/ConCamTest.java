package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCamTest {

	@Test
	public void Concattest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.Concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
