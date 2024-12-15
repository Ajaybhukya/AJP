// Program that  illustrating the *instance variables & Methods*

public class College {
	static String affiliation="JNTUH";
	String College_name; // Declaring the instance variable of the class
	String collegeCode;
	String address;
	long phno;
	int jntuh=2500;
	int mini_project=2000;
	int major_project=5000;
	String bank_name="Axis Bank";
	
	public void college_detailes() // Declaring the method for a class
	{
		System.out.println("\n college_name:"+College_name+"\n College_code:"+collegeCode+"\n address:"+address+"\n Phno:"+phno);
	}
	public void sample() // Method 2
	{
		System.out.println("You creating an class and object succesfully");
	}
	public void fee()
	{
		System.out.println("Jntuh fee:"+jntuh);
		System.out.println("mini_project fee:"+mini_project);
		System.out.println("Major project fee:"+major_project);
		System.out.println("Bank name of college fee:"+bank_name);

	}
	public static void main(String[] args) {
		College avanthi=new College();
		avanthi.College_name="Avanthi Ins Of Eng And Tech";
		avanthi.collegeCode="Q6";
		avanthi.address="Gunthapally";
		avanthi.phno=487453;
		avanthi.college_detailes(); // Calling the instance method
		avanthi.sample(); // Calling the another method
		avanthi.fee();// calling fee method
		System.out.println("Static Variable: "+affiliation);
	}
}
