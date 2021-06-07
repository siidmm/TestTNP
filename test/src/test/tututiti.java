 package test;
 
 import java.util.Scanner;

public class tututiti {
	
   /* Function checking if the number contains digit 3, 5  or  7*/
	
	public static String contentcheck  (String number ) {
		
		char[] digit = number.toCharArray();
		String result="" ;
		for(char d : digit){
			switch (d) {
			  case '3':
				  result +="Toto" ;
				  break;
			  case '5':
				  result +="Tutu"; 
				  break;
			  case '7':
				  result +="Titi" ;
				  break;
	         }
		
		}
		return result ;
	}
	/* Function  that compute the step 1 rules */
	
	public static String step1  (String number ) {
		

	     String result="" ; /* creating the variable that will return the result   */
	     
	     /* Making a try and catch to prevent any error from the user  */
	 	
		 try {  
			Integer num  = Integer.parseInt(number); /* Transform the string in number if possible */
			
			/* checking if it's divisible by  3, 5  or  7  */
			
			if (( num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0)){
				
				char[] digit = number.toCharArray();
				for(char d : digit){
					switch (d) {
					  case '3':
						  result +="Toto" ;
						  break;
					  case '5':
						  result +="Tutu"; 
						  break;
					  case '7':
						  result +="Titi" ;
						  break;
					  default:
						  result += d;
			         }
				
				}
			}
			else {
				if (num % 3== 0)  result +="Toto" ;
				if (num % 5== 0)  result +="Tutu" ;
				if (num % 7== 0)  result +="Titi" ;
				
				result+=contentcheck(number) ;
				
			}
			return result ;
			
		    } catch (Exception e) {
		     
		    	System.out.println(" Il y a une erreur d'entree.");
		    	return "indisponible" ;
		    }
		
		 
	}
	
	/* Function  that compute the step 1 rules */
	
	public static String step2  (String number ) {
		
	     String result="" ;  /* creating the variable that will return the result   */
	     
	     /* Making a try and catch to prevent any error from the user  */
	     
		 try {  
			Integer num  = Integer.parseInt(number);  /* Transform the string in number if possible */
			
			char[] digit = number.toCharArray();
			
			/* checking if it's divisible by  3, 5  or  7  */
			
			if (( num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0)){
				for(char d : digit){
					switch (d) {
					  case '0':
						  result +="*" ;
						  break;
					  case '3':
						  result +="Toto" ;
						  break;
					  case '5':
						  result +="Tutu"; 
						  break;
					  case '7':
						  result +="Titi" ;
						  break;
					  default:
						  result += d;
			         }
				
				}
			}
			else {
				if (num % 3== 0)  result +="Toto" ;
				if (num % 5== 0)  result +="Tutu" ;
				if (num % 7== 0)  result +="Titi" ;
				
				
				for(char d : digit){
					if (d== '0') result +="*" ;
				}
				result += contentcheck(number) ;
			}
			return result;
			
		    } catch (Exception e) {
		     
		    	System.out.println(" Il y a une erreur d'entree.");
		    	return "indisponible veillez entrez un nombre valide SVP" ;
		    }
		
	}
	public static void main(String[] args) {
		
		
		    Scanner sc = new Scanner( System.in ) ;
		    
		    Boolean restart = true  ;
		    
		    while (restart)
		    {
		    	System.out.println( "Veuillez saisir un nombre : " );
		        String nombre = sc.nextLine();
		       
		        System.out.println( "Choisissez le mode   " );
		        System.out.println( "Tapez 1 pour step1 ou Tapez 2 pour step2: " );
		        String choix = sc.nextLine();
		        
		        /* checking if the user made a correct choice for the mode of computing  */
		        
		        while (!(choix.equalsIgnoreCase("1")) && !(choix.equalsIgnoreCase("2")))
		        {
		        	 System.out.println( "Veuillez faire un choix correct svp " );
		             System.out.println( "Tapez 1 pour step1 ou Tapez 2 pour step2 " );
		             choix = sc.nextLine();
		        	
		        }
		        
		        /* Executing a step according to the choice   */
		        
		        if (choix.equalsIgnoreCase("1")) System.out.println( "Le resultat est  "  + step1(nombre) ); 
		        else System.out.println( "Le resultat est  "  + step2(nombre) );
		        
		        
		        System.out.println( "Tapez Y pour recommencez  ou Tapez N pour Quitter " );
		        String choice = sc.nextLine();
		        
		        while (!(choice.equalsIgnoreCase("Y")) && !(choice.equalsIgnoreCase("N")))
		        {
		        	 System.out.println( "Veuillez faire un choix correct svp " );
		        	 System.out.println( "Tapez Y pour recommencez  ou Tapez N pour Quitter " );;
		             choice = sc.nextLine();
		        	
		        }
		        
		        if (choice.equalsIgnoreCase("N")) restart = false  ; 
		    }
		
			
		    sc.close();
		    System.exit(0);
		    
	        
		 
        
        
	}

}
