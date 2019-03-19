/*
* Unit test cases for Calculator
*/
class CalculatorUnitTestCase{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(10, c.Operation(6,4,"Addition"));
		assertEquals(2, c.Operation(6,4,"Subtraction"));
		assertEquals(24, c.Operation(6,4,"Multiplication"));
	}
}