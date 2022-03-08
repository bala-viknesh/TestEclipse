package MainTest;

import org.testng.annotations.Test;

public class CallingMethod {
	

@Test(priority = 1)
public void registration()
{
System.out.println("Registration Test");
}

@Test(priority = 2)
public void login()
{
System.out.println("Login Test");
}

@Test(priority = 3)
public void payment()
{
System.out.println("Payment Test");
}

@Test(priority = 4)
public void logoff()
{
System.out.println("Logoff Test");
}



}

