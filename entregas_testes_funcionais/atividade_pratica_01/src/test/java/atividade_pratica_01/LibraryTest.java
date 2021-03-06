/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package atividade_pratica_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
	Converter converter = new Converter();
	
	@Test public void convertingRealToDollar() throws Exception {
		// Double.compare returns 0 if the two values are numerically equals
        assertEquals(Double.compare(converter.convertToDollar(1.0, "BRL"), 0.2), 0);
    }
	
	@Test public void convertingEuroToDollar() throws Exception {
		// Double.compare returns 0 if the two values are numerically equals
        assertEquals(Double.compare(converter.convertToDollar(5.0, "EUR"), 5.9), 0);
    }
	
	@Test public void testExpectedException() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			converter.convertToDollar(10.0, "ABC");
		});
		
		assertEquals(exception.getMessage(), "Currency not available");
	}

	@Test public void whenValueIsLowerThanZero() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			converter.convertToDollar(-5.0, "BRL");
		});

		assertEquals(exception.getMessage(), "Value out of range");
	}
	
	@Test public void whenValueIsBiggerThanMaxValue() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			converter.convertToDollar(Double.MAX_VALUE + 1, "BRL");
		});

		assertEquals(exception.getMessage(), "Value out of range");
	}
}
