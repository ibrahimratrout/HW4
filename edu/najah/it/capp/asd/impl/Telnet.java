package edu.najah.it.capp.asd.impl;

import edu.najah.it.capp.asd.intf.FactoryProtocol;

public class Telnet extends FactoryProtocol {

private static FactoryProtocol instance;
	
	
	private Telnet() {
		System.out.println("Creating a new Telnet insatnce");
	}
	
	public static FactoryProtocol getInsatnce() {
		if(instance == null) {
			instance = new Telnet();
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
		System.out.println("Sending message from TELNET :: " + message);

	}

}
