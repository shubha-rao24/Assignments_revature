package emp;

public class emp_Address {
	private int aid;
	private String streetName;
	private int zip;

	public emp_Address(int aid, String streetName, int zip) {
		super();
		this.aid = aid;
		this.streetName = streetName;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "emp_Address [aid=" + aid + ", streetName=" + streetName + ", zip=" + zip + "]";
	}

}
