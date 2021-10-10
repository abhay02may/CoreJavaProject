package com.cred.java8;


interface Interf{
	
	public void m1();
	
}


public class AnonymousAndLambda {
	int x=888;
	
	public void m2() {
		
		Interf refObj=new Interf() {
			int x=999;// Inside Anonymous class this will not be local variable and will be an instance variable
			@Override
			public void m1() {
				System.out.println(this.x);
			}
		};
		refObj.m1();
	}
	
	public void m3() {
		Interf refObj2=()->{
			int x=999;// Inside Lambda this will be local variable and not instance variable
			System.out.println(this.x);
		};
		refObj2.m1();
		
	}
	
	
	public static void main(String[] args) {

		AnonymousAndLambda obj=new AnonymousAndLambda();
		obj.m2();
		
		obj.m3();
		
		
	}

}


