import java.util.Scanner;

class Userinput{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String name = "";
		System.out.print("Please Enter Your Name: ");
		name = scan.next();
		System.out.println("Your name is: " + name);
		
		System.out.println("********");
		
		int marks = 0;
		System.out.println("Please Enter Your Marks: ");
		marks = scan.nextInt();
		System.out.println("Your marks is: " + marks);
	}
}