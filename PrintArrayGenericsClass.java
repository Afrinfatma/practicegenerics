package com.practicegenerics;

public class PrintArrayGenericsClass <A>{
	private A[] inputArray;
	
	public PrintArrayGenericsClass (A[] inputArray) {
		this.inputArray=inputArray;
	}
		public void toPrint() {
			PrintArrayGenericsClass.toPrint(this.inputArray);
		}
		
		public static <E> void toPrint(E[] inputArray) {
			for (E element : inputArray) {
				System.out.printf("%s " , element);
			}
			System.out.println();
		}
		public static void main(String[] args){
		  Integer[] intArray= {1,2,3,6,9,8};	
		  Double[] doubleArray= {1.2,2.4,3.5,6.7,9.9,8.0};
		  Character[] charArray= {'a','b','c','d'};
		 
		  
		  new PrintArrayGenericsClass<Integer>(intArray).toPrint();
		  new PrintArrayGenericsClass<Double>(doubleArray).toPrint(); 
		  new PrintArrayGenericsClass<Character>(charArray).toPrint();
		  
		  
		}		

}
