public class Conditional5
{
   public static void main(String[] args)
   {
	   int a;
	   String[] diena = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};
	   
	   
	   
	   System.out.println("Iveskite dienos numeri (1 ... 7): ");
	   a = Integer.valueOf(System.console().readLine());
   
       System.out.println(diena[--a]);
  }
    
}
