package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionexample {
	
	/*char name='A';
    char name1='A';*/	
   boolean act=true;
   boolean dam=true;
    @Test
	public void checkEqual()
	{
	
    	/*Assert.assertEquals(name,name1);*/
    	Assert.assertEquals(act,dam);
    	
}
}