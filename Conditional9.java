public class conditional9
{
   public static void main(String[] args)
   {
	   System.out.println("Iveskite metus: ");
	  int y = Integer.valueOf(System.console().readLine());

	          //tikrinam ar keliamieji metai
   	   if ((y % 400 == 0) || (y % 4 == 0) && (y % 100 != 0)) {
	       System.out.println( y + "  yra keliamieji metai");
       } else {
		   	System.out.println( y + "  nera keliamieji metai");
	   }
		   
   }

}
