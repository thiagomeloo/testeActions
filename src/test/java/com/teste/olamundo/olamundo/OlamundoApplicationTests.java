package com.teste.olamundo.olamundo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OlamundoApplicationTests {

	@Test
	void testeSucesso() {
		int x = 2;
		assertEquals(2, x);
	}

	@Test
	void testeFalha() {
		String x = "x";
		assertEquals("x", x);
	}

	@Test
	void testeFalha2() {
		String x = "x";
		assertEquals("xa", x);
	}
}
