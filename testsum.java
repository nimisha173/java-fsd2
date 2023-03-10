package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.Test;

import count.sum;


public class testsum {
@Test
public void add() {
	sum obj=new sum();
	assertEquals(9,obj.add(4,5));
}
}
