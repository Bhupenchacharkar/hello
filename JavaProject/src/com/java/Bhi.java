package com.java;
import java.util.*;
public class Bhi {
	public static void multiplication( int no) {
		for(int i = 0; i<=10; i++) {
			int c= no*i;
			System.out.println(no+ "*"+ i+"="+ c);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(" enter no");
		Scanner sc = new Scanner(System.in);
	      int X = sc.nextInt();
	      System.out.println(X);
	      multiplication(X);
	
}}


