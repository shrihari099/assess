package com.D.test;

import com.A.common.BaseClass;
import com.C.pageview.HomepageView;
import com.C.pageview.InfosysPageView;

public class TestClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass obj_calling_getdriver=new BaseClass();
		obj_calling_getdriver.setDriver();
		obj_calling_getdriver.Browser();
		
		HomepageView obj_calling_HPV=new HomepageView();
		obj_calling_HPV.HPV();
		
		Thread.sleep(3000);
		InfosysPageView obj_calling_IPV =new InfosysPageView();
		obj_calling_IPV.IPV();
		
	}

}
