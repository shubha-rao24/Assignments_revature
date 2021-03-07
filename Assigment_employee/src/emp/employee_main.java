package emp;

//Create Employee class with id,name,age,email
//and Project(projectid,projectname,clientname)
//and present and permanent Address(aid,streetname,city,state,zip)
public class employee_main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "sam");
		emp1.setAge(24);
		emp1.setEmail("xyz@yahoo.com");
		emp1.setProjectid(234);
		emp1.setClientname("walgreeens");
		emp1.setProjectname("Businessops");
		emp1.setCity("Boston");
		
		emp_Address a3 = new emp_Address(1111111, "sdf street", 345677);
		
		emp1.setPersonAddress(a3);
		System.out.println(emp1);

		Employee emp2 = new Employee(102, "Ram", 23, "Abd@gmail.com","newyork");
		emp2.setCity("newyork");
		System.out.println(emp2);

		emp_Address a = new emp_Address(99999, "xyz street", 200090);
		emp_permanantAddress a1 = new emp_permanantAddress(345678, "abc street", 287690);

		Employee emp3 = new Employee(105, "tom", 39, "rgt@gmail.com", "chicago", a,a1);
		emp3.setClientname("CVS");
		emp3.setProjectid(345);
		emp3.setProjectname("testing");
		//emp3.setPermanantAddress(a1);

		System.out.println(emp3);
	}

}
