import static org.junit.Assert.*;

import org.junit.Test;


public class TextRenderTest {

	@Test
	public void canConcat() {
		TextRender txtRdr = new TextRender();
		String result = txtRdr.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
