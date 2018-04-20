package mx.com.itam.adsi.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Solution s = new Solution();
		assertTrue("Prueba para abab", s.gus("abab"));
		assertTrue("Prueba para ababa", !s.gus("ababa"));
		assertTrue("Prueba para victorvictor", s.gus("victorvictor"));
		assertTrue("Prueba para victorvicto", !s.gus("victorvicto"));
		assertTrue("Prueba para victor", !s.gus("victor"));
		assertTrue("Prueba para dandan", s.gus("dandan"));
		assertTrue("Prueba para danda", !s.gus("danda"));
		assertTrue("Prueba para abaab", !s.gus("abaab"));
		assertTrue("Prueba para abad", !s.gus("abad"));
		assertTrue("Prueba para ababc", !s.gus("ababc"));
		assertTrue("Prueba para cabcaabc", !s.gus("cabcaabc"));
		assertTrue("Prueba para baccab", !s.gus("baccab"));
		assertTrue("Prueba para bacbac", s.gus("bacbac"));
		assertTrue("Prueba para bacacb", !s.gus("bacacb"));
		assertTrue("Prueba para 123321", !s.gus("123321"));
		assertTrue("Prueba para 123123", s.gus("123123"));
		assertTrue("Prueba para 1214", !s.gus("1214"));
		assertTrue("Prueba para holaola", !s.gus("holaola"));
		assertTrue("Prueba para holahola", s.gus("holahola"));
		assertTrue("Prueba para holaholas", !s.gus("holaholas"));
	}

}
