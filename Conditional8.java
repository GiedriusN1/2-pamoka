public class conditional8
{
   public static void main(String[] args)
   {
	   char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'W', 'Y'};
	   char[] vowels  = {'A', 'E', 'I', 'O', 'U'};
   
	   System.out.println("Input a Letter: ");
	   char a = System.console().readLine().charAt(0); // destytojo parodytas
	   // a = in.next().charAt(0);  // neveikia
	   // a = Console.readChar("Enter the Character"); --- reikalauja BreezyGUI bibliotekos
        boolean con = false;
		boolean vow = false;
		   
		   int i = 0;
		   
		   while (i < consonants.length) {			  
			  // System.out.println(i); // kontrolei
			  if (consonants[i] == a) { 
			  System.out.println(a + "  is a consonant");
			  con = true;
			  
			 // break;
			 }
			i++;
		   } 
		   	
			int j = 0;
			while (j < vowels.length) {			  
			  // System.out.println(i); // kontrolei
			  if (vowels[j] == a) { 
			  System.out.println(a + "  is a vowel");
			  vow = true;
			 // break;
			 }
		     j++;
		   } 
		   
		   if (con == false && vow == false) {
		    System.out.println("Error. Not an Alphabet character.");
		   }
		   
   }

}
