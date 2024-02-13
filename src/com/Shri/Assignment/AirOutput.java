package com.Shri.Assignment;
import java.util.Scanner; 
public class AirOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkyAirline sky = new SkyAirline();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        
        System.out.println("Enter the Source");
        String source=sc.nextLine();
        
        System.out.println("Enter the Destination");
        String destination=sc.nextLine();
        
        sky.setName(name);
        sky.setSource(source);
        sky.setDestinaton(destination);
        
        System.out.println(sky);
	}

}
