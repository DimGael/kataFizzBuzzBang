package m3105.kata.FizzBuzzBang;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void doitRepondre_LeNombre_PourUnCasSimple() {
		assertEquals("1", fizzBuzz.donnerLaReponsePour(1));
		assertEquals("2", fizzBuzz.donnerLaReponsePour(2));
		assertEquals("4", fizzBuzz.donnerLaReponsePour(4));
	}

	@Test
	public void doitRepondre_fizz_PourUnNombreMultipleDe3() {
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(3));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(6));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(9));
	}

	@Test
	public void doitRepondre_buzz_PourUnNombreMultipleDe5() {
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(5));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(10));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(20));
	}

	@Test
	public void doitRepondre_fizzbuzz_PourUnNombreMultipleDe3EtMultipleDe5() {
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(15));
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(30));
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(45));
	}
	
	@Test
	public void doitRepondre_bang_PourUnNombreMultipleDe7() {
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(14));
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(28));
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(56));
		
	}
	
	@Test
	public void doitRepondre_fizzbang_PourUnNombreMultipleDe7EtDe3() {
		assertEquals("fizzbang", fizzBuzz.donnerLaReponsePour(21));
		assertEquals("fizzbang", fizzBuzz.donnerLaReponsePour(42));
		assertEquals("fizzbang", fizzBuzz.donnerLaReponsePour(63));		
	}
	
	@Test
	public void doitRepondre_buzzbang_PourUnNombreMultipleDe7EtDe5() {
		assertEquals("buzzbang", fizzBuzz.donnerLaReponsePour(35));
		assertEquals("buzzbang", fizzBuzz.donnerLaReponsePour(70));
		assertEquals("buzzbang", fizzBuzz.donnerLaReponsePour(140));		
	}
	
	@Test
	public void doitRepondre_fizzbuzzbang_PourUnNombreMultipleDe7De3EtDe5() {
		assertEquals("fizzbuzzbang", fizzBuzz.donnerLaReponsePour(105));
		assertEquals("fizzbuzzbang", fizzBuzz.donnerLaReponsePour(210));
		assertEquals("fizzbuzzbang", fizzBuzz.donnerLaReponsePour(420));
	}
	
}