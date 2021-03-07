package emp;

public class emp_permanantAddress {
	private int p_aid;
	private String _streetName;
	private int _zip;

	public emp_permanantAddress(int p_aid, String _streetName, int _zip) {

		this.p_aid = p_aid;
		this._streetName = _streetName;
		this._zip = _zip;
	}

	@Override
	public String toString() {
		return "emp_permanantAddress [p_aid=" + p_aid + ", _streetName=" + _streetName + ", _zip=" + _zip + "]";
	}
}
