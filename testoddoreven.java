package ustbatchno3.junit5testcases;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class testoddoreven {
	@Test
public void testEven() {
	int n=10;
	boolean result=isEven(n);
	assertTrue(result);
	
	
}
public void testOdd() {
	int n=10;
	boolean result=isEven(n);
	assertFalse(result);
	
	
}
public boolean isEven(int n) {
	return n%2==0;
}

}
