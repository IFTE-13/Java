public class Blooddoner {
	public static void main (String[] args) {
		Registration rt[] = new Registration[3];
		rt[0] = new Registration(1, "ABC", "B+");
		rt[1] = new Registration(2, "DEF", "A+");
		rt[2] = new Registration(3, "GHI", "O+");

		for(int i = 0; i < rt.length; i++) {
			if(rt[i] != null) {
				rt[i].show(); }
		}
	    System.out.println("Number of doner registered is: " + rt.length);  }
}
class Registration {
	int id;
 	String name;
	String bloodGroup;

	public Registration(int id, String name, String bloodGroup) {
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;  }

	void setId(int id) {
		this.id = id;  }
	int getId() {
		return id;  }
	void setName(String name) {
		this.name = name;  }
	String getName() {
		return name;  }
	void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;  }
	String getBloodGroup() {
		return bloodGroup;  }
	void show() {
		System.out.println("id: " + getId() + " name: " + getName() + " bloodGroup: " + getBloodGroup()); 

 }
}
