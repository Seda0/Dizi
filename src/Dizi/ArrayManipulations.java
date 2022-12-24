package Dizi;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.println("%n doubleArray: ");
	for (double value:doubleArray) {
		System.out.printf("%.1f",value);
	}
        int[] filledIntArray=new int[10];
        
        Arrays.fill(filledIntArray, 0 );
        displayArray(filleIntdArray, "filledIntArray");
        int[] intArray= {1,2,3,4,5,6};
        int[] intArrayCopy=new int[intArray.length];
       System.arraycopy(intArray, 0, intArrayCopy, 0, intArray,lenght);
        displayArray(intArray,"intArray");
        displayArrayCopy(intArray,"intArrayCopy");
        
        boolean b=Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",(b ? "==" : "!="));
        b=Arrays.equals(intArray ,filledIntArray);
        System.out.printf("intArray %s filledintArray%n", (b ?"==" : "!="));
        
        public static void displayArray(int[] array, String description) {
        	System.out.printf("%n%s: ", description);
        	for(int value:array) {
        		System.out.printf("%d" , value);
        	}
        
	 
	}
}
}
