import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class Dec2HexTest
{
	Dec2Hex app;

	@BeforeEach
	void setUp()
	{
		app = new Dec2Hex();
	}

	@Test
	@DisplayName("Passing expected arguments")
	void testExpected()
	{
		String[] args = {"15",};
		assertEquals("F", app.convertDecimalToHex(15));
	}

	@Test
	@DisplayName("No Arguments are passed")
	void testNullarguments()
	{
		String[] args = {};
		assertThrows(IllegalArgumentException.class, () -> {
			app.parseInteger(args);
		});
	}

	@Test
	@DisplayName("Passing too many arguments")
	void testTooManyArguments()
	{
		String[] args = {"15","25"}
		assertThrow(IllegalArgumentException.class, () -> {
			app.parseInteger(args);
		});
	}

	@Test
	@DisplayName("Passing wrong datatype")
	void testWrongFormat()
	{
		String[] args = {"fifteen"}
		assertThrow(NumberFormatException.class, () -> {
			app.parseInteger(args);
		});
	}



}
