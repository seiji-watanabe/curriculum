package check;
import constants.Constants;

public class Check {
	public static void main(String[] args) {
		System.out.println("printNameメソッド → " + printName(firstName,lastName));
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce() ;
	}
	
	private static String firstName = "渡邉";
	private static String lastName = "誠二";
	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
}

