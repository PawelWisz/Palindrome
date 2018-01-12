package system;
/*
Write a program that returns the largest number-palindrome, 
which is the product of two prime five-digit numbers 
and returns the multipliers themselves.
*/

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Pawel Wiszniewski
*/

public class Palindrome {

	public static void main(String[] args) {
		List<Long> primeList = new ArrayList<Long>();		//List where is storage all prime number
		
		int j = 0;											//auxiliary object, told us how many is prime numbers
		long product;
		int k = 0;
		long palindromProduct = 0;
		long g = 0;
		long h = 0;
		long maks=0;
		   
	      for(long i = 10000; i<=99999; i++){				//limit five-digit numbers 	     
	          if(prime(i)){
	        	  primeList.add(i);							//added prime number to list
	        	  j++;
	              
	          	}
	      }
	     
	     do{													//loop "for" inside loop "do-while" for return all product
	    	  for(int i=-1;i<(j-1);i++){
	    		 product = primeList.get(k)*primeList.get(i+1);    		 
	    		 if(isPalindrome(product)){						//if product is palindrome return the largest one and the multipliers themselves
	    			 	palindromProduct = product;
	    		 		g=primeList.get(k);
	    		 		h=primeList.get(i+1);
	    		 			if(maks(palindromProduct)){
	    		 				maks=palindromProduct;}
	    		 	}
	    		 }
	    	  k++;
	    	  
	     	}while(k<j);
	     
	     System.out.println("The Biggest Palindrome number: "+palindromProduct);
	     System.out.println("First multiplier: "+g);
	     System.out.println("Second multiplier: "+h);
	      
	}
	
	
	public static boolean prime(long n){						//method for check number is Prime or not 
		for(int i=2; i<n; i++){
            if(n%i == 0){
                return false; 								//number is  not prime
            }
         }
         return true; 										//number is prime now
	}
	
	public static boolean isPalindrome(long n){					//method for check number is Palindrome or not 
		long palNumber = n; 
        long reverse = 0;

        while (palNumber != 0) {							//loop for reverse number 
            long j = palNumber % 10;         
            reverse = reverse * 10 + j;         
            palNumber = palNumber / 10;
        }
        if (n == reverse) {									//if our number equals reverse - number is palindrome
            return true;
        }
        return false;
    }
	
	public static boolean maks(long n){							//method for check the biggest Palindrome number				
		long number1=0;
		if(n>number1)
			return true;
		else
			return false;
		
	}
}
