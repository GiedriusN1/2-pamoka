public class Conditional5
{
   public static void main(String[] args)
   {
	   int a;
	   String[] diena = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};
	   String printas = "";
	  	   
	   System.out.println("Iveskite dienos numeri (1 ... 7): ");
	   a = Integer.valueOf(System.console().readLine());
		if (a > 7) {
			printas = "N/A";
        }
		else
			{
			printas = diena[--a];
			}
   
       System.out.println(printas);
  }
 }