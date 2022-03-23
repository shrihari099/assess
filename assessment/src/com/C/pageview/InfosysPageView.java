package com.C.pageview;

import com.B.pages.InfosysPage;

public class InfosysPageView {

	public void IPV() throws InterruptedException {
		InfosysPage obj_calling_InfosysPage=new InfosysPage();

		String a=obj_calling_InfosysPage.high();

		String a1=a.replaceAll("[$,₹? ]","0");
		float m1=Float.parseFloat(a1);

		String b=obj_calling_InfosysPage.low();

		String b1=b.replaceAll("[$,₹? ]","0");
		float m2=Float.parseFloat(b1);

		System.out.println("The Lowest value of Infosys ltd: "+b1);
		System.out.println("The highest value of Infosys ltd: "+a1);
		System.out.println("The total Difference in Highest and Lowest value is ");
		System.out.println(m1+" - "+m2+" = "+(m1-m2));
	}
}

