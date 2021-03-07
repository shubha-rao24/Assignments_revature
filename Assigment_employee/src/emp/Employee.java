package emp;

//Create Employee class with id,name,age,email
public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;

	public Employee(int id, String name, int age, String email, String city, String clientname,
			emp_Address personAddress, emp_permanantAddress permanantAddress) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
		this.clientname = clientname;
		this.personAddress = personAddress;
		this.permanantAddress = permanantAddress;
	}

	public emp_permanantAddress getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(emp_permanantAddress permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	private String city;
	private int projectid;
	private String projectname;
	private String clientname;
	private emp_Address personAddress;
	private emp_permanantAddress permanantAddress;

	public Employee(String projectname, String clientname, emp_Address personAddress) {

		this.projectname = projectname;
		this.clientname = clientname;
		this.personAddress = personAddress;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	

	public Employee(int id, String name, int age, String email, String city, emp_Address personAddress,
			emp_permanantAddress permanantAddress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
		this.personAddress = personAddress;
		this.permanantAddress = permanantAddress;
	}

	public Employee(int id, String name, int age, String email, String city) {

		this(id, name); // constructor chaining

		this.age = age;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city
				+ ", projectid=" + projectid + ", projectname=" + projectname + ", clientname=" + clientname
				+ ", personAddress=" + personAddress + ", permanantAddress=" + permanantAddress + "]";
	}

	public emp_Address getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(emp_Address personAddress) {
		this.personAddress = personAddress;
	}

	

	

}
