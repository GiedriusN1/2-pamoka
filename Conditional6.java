public class Conditional6
{
   public static void main(String[] args)
   {
	   float a;
	   float b;

   
	   System.out.println("Enter the first Float number: ");
	   a = Float.valueOf(System.console().readLine());
	   System.out.println("Enter the second Float number: ");
	   b = Float.valueOf(System.console().readLine());
	   
	    a = Math.round(a * 1000);
        a = a / 1000;
	    b = Math.round(b * 1000);
        b = b / 1000;
   
        if (a == b) 
		{
			
        System.out.println("Numbers are the same up to three decimal places");
        }
        else
        {
        System.out.println("Numbers are different");
        }
  }
}