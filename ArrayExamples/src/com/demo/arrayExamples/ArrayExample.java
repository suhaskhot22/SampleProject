package com.demo.arrayExamples;

public class ArrayExample {
public static void main(String[] args) {
	//int[6] x;//at time of declaration we cant specify the size
	//array declaration & creation
	/*int[] x=new int[5];//compulsory u should specify the size at array creation
	x[0]=10;//array initialization
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;*/
	
	/*int[] x={10,20,30,40,50};//array declaration,creation,initialization at single line
	
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}*/
	//for array length variable is applicable
	//int[] x=new int[5];
	//System.out.println(x.length);
	
	//for string length() method is applicable
	
/*	String s="Suhas";
	System.out.println(s.length());*/
	
	//3rd Scenario
	int[][] x=new int[2][];
	System.out.println(x);
	System.out.println(x[0]);
	System.out.println(x[0][0]);
	
}
}
