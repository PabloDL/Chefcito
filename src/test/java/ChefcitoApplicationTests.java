

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ChefcitoApplicationTests {
	
	
	
	@Test
	void itShouldAddNumbers() {
		//given
		int numberOne = 20;
		int numberTwo = 30;
		
		//when 
		int result = Calculator.add(numberOne, numberTwo);
		
		//then
		int expected = 50;
		assertThat(result).isEqualTo(expected);
		
		
		
	}

	static class Calculator {
		static int add(int a, int b) {
			return a + b;
		}

		static int substract(int a, int b) {
			return a - b;
		}
	}
}
