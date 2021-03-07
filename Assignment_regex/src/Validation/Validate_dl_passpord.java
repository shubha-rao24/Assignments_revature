package Validation;

public class Validate_dl_passpord {

	public static void main(String[] args)
	{
		// 3 uppercase letters followed by -and 4 digits [A-Z]{3}-[0-9]{4}/
				 String Drv_licence="K400-7836-0001";
				
				 if (Drv_licence.matches("[A-Z]{1}[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
						System.out.println("validated");
					} else {

						System.out.println("not validated");
					}
				
				//US passportnum C245978932
				
				 String Us_passport="C245978932";
					
				 if (Us_passport.matches("C[0-9]{9}")) {
						System.out.println("validated");
					} else {

						System.out.println("not validated");
					}

	}

}
