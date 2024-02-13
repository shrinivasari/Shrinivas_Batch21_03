package com.Shri.Assignment1;

public class Base {
	
	int vardefault=10;
	private int varprivate=20;
	public int varpublic=30;
	protected int varpro=40;
	
	// default Method
	
	void defaultMethod() {
		System.out.println("Default Var= "+vardefault);
		System.out.println("Default Method");
		System.out.println("--------------------------------------");
	}
	
	 public void publicMethod() {
		 System.out.println("Public Var= "+varpublic);
			System.out.println("Public Method");
			System.out.println("--------------------------------------");
		 
	 }
	 
	 private void privateMethod() {
		 System.out.println("Private Var= "+varprivate);
			System.out.println("Private Method");
			System.out.println("--------------------------------------");
		 
	 }
	 
	 protected void protectedMethod() {
		 System.out.println("Protected Var= "+varpro);
			System.out.println("Protected Method");
			System.out.println("--------------------------------------");
		 
	 }
	 

}
