import java.util.Scanner;

public class UserInput{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.Out.Print("Please enter your full name:");
		String FullName = scan.nextline();
		
		System.Out.Print("Enter your address:");
		String address= scan.nextline();
		
		System.Out.Print("Enter your age:");
		Int age = scan.nextline();
		scan.nextline();
		
		System.Out.Print("Enter your gender(M/F: ");
		String gender = scan.next();
		
		System.Out.Printf("Are you happy to learn Java?(true/false: ");
		boolean isHappy = scan.nextboolean();
		
		System.Out.Println("");
		System.Out.Println("");
		
		System.Out.Printf("Hello %s ,How are you today?%n",fullName);
		System.Out.Printf("Nice meeting you, you are living in %s%n",address);
		System.Out.Printf("%s You are %d years old%n",fullName,age);
		System.Out.Printf("You are a %s%n "gender");
		System.Out.Printf("Are you happy to learn Java?%b%n", isHappy");
		
	}
}	

