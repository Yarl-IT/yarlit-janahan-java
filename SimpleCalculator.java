import java.util.Scanner;

class SimpleCalculator{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		double FirstNumber;
		double SecondNumber;
		double Output;
		int Operations;
		
		System.out.println("Please Enter Your First Number: ");
		FirstNumber = scan.nextDouble();
		
		System.out.println("Please Enter Your Second Number: ");
		SecondNumber = scan.nextDouble();
		
		System.out.println("\nChoose Operations: ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Devision (/)");
		
		System.out.println("Please Enter Your Operation: ");
		Operations = scan.nextInt();
		
		switch(Operations){
			case 1:
				Output = FirstNumber + SecondNumber;
				System.out.println(Output);
				break;
			
			case 2:
				Output = FirstNumber - SecondNumber;
				System.out.println(Output);
				break;
			
			case 3:
				Output = FirstNumber * SecondNumber;
				System.out.println(Output);
				break;
				
			case 4:
				Output = FirstNumber / SecondNumber;
				System.out.println(Output);
				break;
		}
	}
}
	
	