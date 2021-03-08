package Business_invalidpassport;

public class Passport_check_logic
{
public boolean isValidpassport(String number) 
{
	if(!number.matches("C[0-9]{9}"))
	{
		throw new InvalidPassportException("Passport is "
				+ "invalid");
	}
	return true;
}


}