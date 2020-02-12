public class Conditional4
{
   public static void main(String[] args)
   {
	   Float a;
	   String reiksme = "";
	   String dydis = "";

	   
	   
	   System.out.println("Enter the float number: ");
	   a = Float.valueOf(System.console().readLine());
	   

	            if (a == 0) {
                reiksme = "zero";
                }
				else if (a > 0) {
				reiksme = "positive";
				}
				else {reiksme = "negative";}
				
				
				if (a < 1) {
					dydis = "Small";
				}
				
				if (a > 1000000) {
					dydis = "Large";
				}
				
                System.out.println(dydis + " " + reiksme + "  number");
            }

    
}
