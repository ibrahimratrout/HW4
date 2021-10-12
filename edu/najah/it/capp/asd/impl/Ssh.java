package edu.najah.it.capp.asd.impl;

import edu.najah.it.capp.asd.intf.FactoryProtocol;

public class Ssh extends FactoryProtocol {

private static FactoryProtocol instance;
	
	
	private Ssh() {
		System.out.println("Creating a new SSH insatnce");
	}
	
	public static FactoryProtocol getInsatnce() {
		if(instance == null) {
			instance = new Ssh();
		}
		return instance;
	}
	@Override
	public boolean release() {
		instance = null;
		return true;
	}

	@Override
	public void send(String message) {
		System.out.println("Sending message from SSH :: " + message);

	}

}
