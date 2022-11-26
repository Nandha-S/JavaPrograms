class Members{
	static int a=10;
	static int b=20;
	static int x=m1();
	static int m1(){
	m2();
	System.out.println("method1");
	return 0;
	}
	static{
	System.out.println("static block");
	}
	static void m2(){
	System.out.println("method2");
	}
	static void m3(){
	System.out.println("method3");
	}
	
	public static void main(String[] args){
		System.out.println("Main method");
		m3();
		System.out.println(a+b);
	}
}