 package test;
 
 import java.util.Scanner;

public class tututiti {
   
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
	public static String step1  (String number ) {
		

	     String result="" ;
		 try {  
			Integer num  = Integer.parseInt(number);
			
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
	public static String step2  (String number ) {
		
	     String result="" ;
		 try {  
			Integer num  = Integer.parseInt(number);
			char[] digit = number.toCharArray();
			
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
		
			System.out.println( "Veuillez saisir un nombre : " );
	        String nombre = sc.nextLine();
	       
	        System.out.println( "Choisissez le mode   " );
	        System.out.println( "Tapez 1 pour step1 ou Tapez 2 pour step2: " );
	        Integer choix = sc.nextInt();
	        
	        while ((choix != 1) &&(choix != 2))
	        {
	        	 System.out.println( "Veuillez faire un choix correct svp " );
	             System.out.println( "Tapez 1 pour step1 ou Tapez 2 pour step2 " );
	             choix = sc.nextInt();
	        	
	        }
	        if (choix == 1) System.out.println( "Le resultat est  "  + step1(nombre) ); 
	        else System.out.println( "Le resultat est  "  + step2(nombre) );
	        
	        
		 
        
        sc.close();
	}

}
