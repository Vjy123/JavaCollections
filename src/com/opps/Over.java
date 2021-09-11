package com.opps;
 class Over 
{
	public void msg() 
	{
		System.out.println("hiii");
	}
}
 class Vijay extends Over
 {
	 public void msg()
	 {
		 System.out.println("hello");
	 }
 }
 class Inhiretence
 {
	 public static void main(String args[])
	 {
		 Over ov=new Over();
		 ov.msg();
		 Vijay vj=new Vijay();
		 vj.msg();
		 Over or=new Vijay();
		 or.msg();
		 System.out.println("Result="+or);
		 
		
	

		

	}

}
