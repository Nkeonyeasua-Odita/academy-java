package com.bptn.course._05_strings;

public class TeachBack {
	
	public static void main(String[] args) {
		//LOGICAL OPERATORS 
		
		int num1 = 20; 
        int num2 = 18;
        int num3 = 30;

        boolean andNum = (num1 > num2) & (num2 >= num3);
        System.out.println("Result of AND: " + andNum); //  false (20>18) && (18>30)

        boolean orNum = (num1 > num2) | (num2 > num3);
        System.out.println("Result of OR: " + orNum); //   true (20>18)

        boolean notNum = !(num1 > num2);
        System.out.println("Result of NOT: " + notNum); //  false !(20>18)
        
        boolean result = (num1 > num2) | (num2 > num3) & (num3 > num1);
        System.out.println("Th result is  :" + result); // (20>18) || (18>30) && (30>20)
	}
}
