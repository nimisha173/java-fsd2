package ustbatchno3.junit5testcases;
import org.junit.Test;
import org.w3c.dom.css.Counter;

import junit.framework.TestCase;
public class duplicatewordcount extends testduplicatecount {
	
@Test
	    private Counter counter;

	    protected void setUp() throws Exception {
	        super.setUp();
	        counter = new Counter<String>();
	    }

	    public void testInitialCountIsZero() throws Exception {
	        assertEquals(0, counter.get("a"));
	    }

	    public void testCount() throws Exception {
	        counter.count("a");
	        assertEquals(1, counter.get("a"));
	    }
	}

