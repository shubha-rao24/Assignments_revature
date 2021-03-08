package Business_invalidpassport;
///Create a BusinessException(checked) and use it for handling for InvalidPassportNumber
public class Business_invalidpassport_main 
{
	Passport_check_logic pc=new Passport_check_logic();
	
	try {
		if(pc.isValidpassport("C234857598"))
		{
			System.out.println("Valid passport number");
		}
	}
	catch(InvalidPassportException e) 
	{
		System.out.println(e.getMessage());
		
	}

}
}