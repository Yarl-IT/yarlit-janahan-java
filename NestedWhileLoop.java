class NestedWhileLoop{
	public static void main(String []args){
		
		int x = 1;
		while(x <= 5){
			int y = 1;
			while(y <= 3){
				System.out.print(y); 
				y++;
			}
			System.out.println(x);
			x++;
		}
	}
}
/*//In the First Iteration
	y 123 & x 1
//In the Second Interation
	y 123 & x 2
//In the Third Interation
	y 123 & x 3
//In the Fourth Interation
	y 123 & x 4
//In the Fifth Interation
	y 123 & x 5

*/