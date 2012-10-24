import static org.junit.Assert.*;

import org.junit.Test;



/**
 * @author Oded
 *
 */

public class FirstTest {

	@Test
	public void test() {
		int input1 = 4;
		int input2 = 7;
		int expectedAnswer = 11;
		int actualAnswer;
		
		
		Operation classUnderTest = new Mult();
		
		actualAnswer = classUnderTest.operation(input1,input2);
		
		assertSame("Not the same",expectedAnswer, actualAnswer);
	}

}
