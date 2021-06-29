package com.automate.automator1;

import utilities.CommonUtil;

public class PageTwo extends PageOne{
	
	//constructor
	private PageTwo() {
		System.out.println("constructor of pageTwo");
	}
	//static block
	static {
		System.out.println("static block");
	}
	
	//instace initialization block
	{
		System.out.println("instace initialization block");
	}

	
	
	public static void main (String[] args) {
		System.out.println("main");
		PageOne obj = new PageTwo();
		obj.myOverride();
		CommonUtil.print(String.valueOf(obj.overloader(2)));
	}
	
	
	long myOverride() {
		System.out.println(" class is PageTwo");
		return 2;
	}
	
}
