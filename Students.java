package Week3.Day1;

public class Students {
	public void getStudentInfo(long id) {
		System.out.println("Student Id: " +id);
	}
	
	public void getStudentInfo(long id, String name) {
		System.out.println("Student Id with Name:");
		System.out.println(id+" "+name);
	}
	
	public void getStudentInfo(String email, String phone) {
		System.out.println("Student eMail with Phone Number:");
		System.out.println(email+" "+phone);
	}
	
	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo(505613);
		std.getStudentInfo(505613, "Kamesh");
		std.getStudentInfo("kamesh@seltestcompany.com", "9876543210");
	}
}
