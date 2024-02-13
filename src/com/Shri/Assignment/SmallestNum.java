package com.Shri.Assignment;

import java.util.Scanner;
public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c,temp,smallest;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the First number");
      a=sc.nextInt();
      System.out.println("Enter the Second number");
      b=sc.nextInt();
      System.out.println("Enter the Third number");
      c=sc.nextInt();
      
      temp= a<b?a:b;
      smallest=c<temp?c:temp;
      if(a==b&&b==c&&c==a) {
    	  System.out.println("All the Three number are same\n");
      }
      
      System.out.println("Smallest number is\n"+smallest);
     
      
	}

}