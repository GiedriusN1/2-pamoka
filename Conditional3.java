public class Conditional3
{
   public static void main(String[] args)
   {
	   int a;
	   int b;
	   int c;
	   int didziausias;
	   
	   
	   System.out.println("Enter the first number: ");
	   a = Integer.valueOf(System.console().readLine());
	   	   System.out.println("Enter the second number: ");
	   b = Integer.valueOf(System.console().readLine());
	   	   System.out.println("Enter the third number: ");
	   c = Integer.valueOf(System.console().readLine());
	   

	            if (a > b && a > c) {
                didziausias = a;
                }
				else if (b > c && b > a) {
				didziausias = 	b;
				}
				else {didziausias = c;}
				
                System.out.println("Didziausias yra: " + didziausias);
            }

    
}
/* Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195 */