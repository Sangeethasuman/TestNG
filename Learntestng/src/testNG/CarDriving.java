package testNG;

import org.testng.annotations.Test;

public class CarDriving {

@Test(priority=0,alwaysRun=false)
public void Startthecar()

{
	System.out.println("car started");
}
@Test(priority=1,enabled=false)	
public void putfirstgear()
{
	System.out.println("first gear on");
}
@Test(priority=2)
public void Secondgear()
{
	System.out.println("second gear on");
}
@Test(priority=3)	
public void thirdcar()
{
	System.out.println("third gear on");
}
}
