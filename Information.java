public class Information {
	public static void main (String[] args) {
		Employee em[] = new Employee[5];
		em[0] = new Employee(1, "ABC", "abc@gmail.com", "123", 100f);
		em[1] = new Employee(2, "DEF", "def@gmail.com", "456", 200f);
		em[2] = new Employee(3, "GHI", "ghi@gmail.com", "789", 300f);
		em[3] = new Employee(4, "JKL", "jkl@gmail.com", "369", 400f);
		em[4] = new Employee(5, "MNO", "mno@gmail.com", "258", 500f);

		for(int i = 0; i < em.length; i++) {
			if(em[i] != null) {
				em[i].show();		
		    }
		}
		float max = em[0].getSalary();
		float min = em[0].getSalary();
		float sum = 0f;
		float avg = 0f;
		for(int i = 0; i < em.length; i++) 
		{
			sum += em[i].getSalary();

			avg = sum/em.length;

			if(em[i].getSalary() > max)
			{
             max = em[i].getSalary();
            }
            if(em[i].getSalary() < min)
			{
             min = em[i].getSalary();
            }
		}
		System.out.println("Maximum Salary is: " + max);
		System.out.println("Minimum Salary is: " + min);
		System.out.println("Avarage Salary is: " + avg);
		
	}
}
class Employee {
	private int id;
 	private String name;
	private String email;
	private String phone;
	private float salary;

	public Employee(int id, String name, String email, String phone, float salary)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name) 
	{
		this.name = name;
	}
	String getName() 
	{
		return name;
	}
	void setEmail(String email) 
	{
		this.email = email;
	}
	String getEmail() 
	{
		return email;
	}
	void setPhone(String phone) 
	{
		this.phone = phone;
	}
	String getPhone() 
	{
		return phone;
	}
	void setSalary(float salary) 
	{
		this.salary = salary;
	}
	float getSalary() 
	{
		return salary;
	}
	void show()
	{
		System.out.println("Id: " + getId() + " Name: " + getName() + " Email: " + getEmail() + " Phone: " + getPhone() + " Salary: " + getSalary());
	}
}
