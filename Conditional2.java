public class Conditional2
{
   public static void main(String[] args)
   {
	   float a;
	   float b;
	   float c;
	   double rez;
	   double r1;
	   double r2;
	   String sk = "";
	   
	   System.out.println("Enter A: ");
	   a = Integer.valueOf(System.console().readLine());
	   	   System.out.println("Enter B: ");
	   b = Integer.valueOf(System.console().readLine());
	   	   System.out.println("Enter C: ");
	   c = Integer.valueOf(System.console().readLine());
	   
	   rez = b * b - 4.0 * a * c;
	   
	            if (rez > 0.0) {
                r1 = (-b + Math.pow(rez, 0.5)) / (2.0 * a);
                r2 = (-b - Math.pow(rez, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (rez == 0.0) {
                r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}
/* Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195 */