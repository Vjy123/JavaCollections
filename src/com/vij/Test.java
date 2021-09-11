package com.vij;

public class Test {

	public static void main(String[] args) 
	{
		int arr[]={10,30,45,6,7,8,9,3,4,2,1,0,26};
		int tmp=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=i+1;j<arr.length;j++)
	    	 
	     {
	    		 if(arr[i]>arr[j])
	    			 
	    		 {
	    			 tmp=arr[i];
	    		     arr[i]=arr[j];
	    		     arr[j]=tmp;
	    		 }
	     }
	    	 System.out.println(arr[i]);
	     }}}
	    	 
	     