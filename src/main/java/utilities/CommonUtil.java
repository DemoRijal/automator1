package utilities;

public class CommonUtil {
	static int a = 1;
	static int b = 3; 
	
	
	//Static Block can run without main method
	/**
	 * A Java program can run without the main method. You need a static block for that, and You need to put your executable code in that static block and execute it. The sequence goes something like this:
	 * The Java Virtual Machine first loads your class
	 * Then it arranges and runs all static blocks
	 * Then finally stare across your code for main() and uses it
	 */
	static{
		
		System.out.println("Static block = " + Math.addExact(a, b)   );
	}
	
	
	//Main method
	public static void main(String[] args) {
		String s = "Santoshi";
		System.out.println("length of s is :"+ s.compareTo(""));
		System.out.println("Main block = " + Math.addExact(a, b)   );
		CommonUtil.StringPlay();
	}
	
	
	static void StringPlay() {
		String s1 = new String( "JavaTime");
		String s2 = "JavaTime";
		
				System.out.println("Before: s1 = "+s1 + " and s2 = "+s2);
		s1 = "Jerry";
		System.out.println("After: s1 = "+s1 + " and s2 = "+s2);
		
	}
	
	public static void print(String t) {
		System.out.println(t);
	}

}
