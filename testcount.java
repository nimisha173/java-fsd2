package ustbatchno3.junit5testcases;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import count.countvowel;

/**
 * @author Administrator
 *
 */
public class testcount {
	
	@Test
	public void counttesting() {
		
		String input ="sharath";
		
		int expected=2;
		int actual=countvowel.vowelscount(input);
		assertEquals(expected,actual);
		
	}
	
}