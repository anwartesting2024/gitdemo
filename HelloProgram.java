class HelloProgram{
	public void static main(arg){
		System.out.println("Hello program")
		System.out.println("Hello Java program");
		System.out.println("Hello Python program");
		
		addMethod(5,7);
		subtractMethod(9,5);
		
		
	}
	
	public static int addMethod(int a, int b){
		System.out.println("Sum:"a+b);
	}
	
	public static int subtractMethod(int a, int b){
		System.out.println("Subtraction result:" a-b);
	}
}