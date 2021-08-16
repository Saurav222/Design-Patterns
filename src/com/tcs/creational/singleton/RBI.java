package com.tcs.creational.singleton;

public class RBI {//singleton
	public static RBI instance;
	private RBI() {
		
	}
	
	public static RBI getInstance() {
		if (instance == null) {
			instance = new RBI();
		}
		return instance;
	}
}
