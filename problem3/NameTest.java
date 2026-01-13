package problem3;

public class NameTest {
	public static void validateName(String title, String firstName, String lastName) {
		if(title == "") {
			throw new IllegalArgumentException("invalid title");
		}
		if(firstName == "") {
			throw new IllegalArgumentException("invalid name");
		}
		if(lastName == "") {
			throw new IllegalArgumentException("invalid name");
		}
		if(title.length() + firstName.length() + lastName.length() > 25) {
			throw new IllegalArgumentException("name too long");
		}
		if(Character.isUpperCase(title.charAt(0)) == false) {
			throw new IllegalArgumentException("not upper case");
		}
		if(Character.isUpperCase(firstName.charAt(0)) == false) {
			throw new IllegalArgumentException("not upper case");
		}
		if(Character.isUpperCase(lastName.charAt(0)) == false) {
			throw new IllegalArgumentException("not upper case");
		}
		System.out.println("Welcome " + title + " " + firstName + " " + lastName);
	}
	public static void main(String[] args) {
		try {
			validateName("Dr.", "Alex", "Montgomery"); 
		} catch (Exception e){
			System.out.println("incorrectly rejected");
		}
		try {
			validateName("Sr.", "Anna", ""); 
		} catch (Exception e){
			System.out.println("correctly rejected");
		}
	}
}
