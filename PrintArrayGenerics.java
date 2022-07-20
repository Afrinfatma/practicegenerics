package com.practicegenerics;

public class PrintArrayGenerics {
	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s " , element);
			
		}
		System.out.println();
		
	}
	
    
	public static void main(String[] args){
	 Integer[] intArray= {1,2,8,9,7,6};
   	 Double[] doubleArray= {1.1,2.6,8.7,9.0,7.7,6.6};
   	 Character[] charArray= {'r','q','o','p','k','o'};
    	
   	 
   	PrintArray.toPrint(intArray); 
   	PrintArray.toPrint(doubleArray);
   	PrintArray.toPrint(charArray);
    
	}
}
