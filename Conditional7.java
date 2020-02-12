public class Conditional7
{
   public static void main(String[] args)
   {
	   int a;
	   int b;
	   int c;
	   int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
	   System.out.println("Input a month number: ");
	   a = Integer.valueOf(System.console().readLine());
	   System.out.println("Input a year: ");
	   b = Integer.valueOf(System.console().readLine());
	   
	   
       //tikrinam ar keliamieji metai
   	   if ((b % 400 == 0) || ((b % 4 == 0) && (b % 100 != 0))) {
	       days[1] = 29; //jei keliamieji priskiriame c keliamojo vasario dienu skaiciu 29
       } 
	   
       c = days [--a]; 		
	   System.out.println("Number of days: " + c);

  }
}