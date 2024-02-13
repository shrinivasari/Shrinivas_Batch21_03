package com.Shri.Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	public String getDuplicateElements() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the size of the array");
			int size = sc.nextInt();
			if(size<=0) {
				sc.close();
				return "Invalid Array Size";
			}
			int[] array = new int[size];
			System.out.println("Enter the elements of an array");
			for(int i=0;i<size;i++) {
				array[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array:");
			
			int index=sc.nextInt();
			if(index<0 || index>=size) {
				sc.close();
				return "Array index is out of Range";
			}
			int replicatedElement = array[index];
			sc.close();
			return "The Array Elemnts are"+ arrayToString(array)+""+replicatedElement;
		}
		catch(InputMismatchException e){
			sc.close();
			return "Negative array size is not allowed";
			
		}
		
	}
	

	private String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i =0; i<array.length;i++) {
			sb.append(array[i]);
			if(i<array.length-1) {
				sb.append(",");
				
			}
		}
		sb.append("]   ");
		return sb.toString();
	}

	public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        System.out.println(ui.getDuplicateElements());

	}

}