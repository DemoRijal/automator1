package com.automate.automator1;

public class PageOne {

	long myOverride() {
		System.out.println(" class is PageOne");
		return 1;
	}
	
	String overloader(String x) {
		return "Invalid input : " +x;
	}
	
	int overloader(int x) {
		return x;
	}
	
	long overloader(long x) {
		return x;
	}
	
	

}
