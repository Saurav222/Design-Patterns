package com.tcs.creational.singleton;

public class Government {
	public static void main(String[] args) {

//		RBI rbi = new RBI();
		RBI rbi = RBI.getInstance();
		RBI rbi1 = RBI.getInstance();
		System.out.println(rbi==rbi1);  //reference equality check
	}
}