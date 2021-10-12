package edu.najah.it.capp.asd;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.intf.FactoryProtocol;

import edu.najah.it.capp.asd.service.Connection;

public class Demo {

	public static void main(String[] args) {
		
		FactoryProtocol ssh = Connection.getInstance(ConnectionType.SSH);
		FactoryProtocol ssh2 = Connection.getInstance(ConnectionType.SSH);
		FactoryProtocol telnet = Connection.getInstance(ConnectionType.TELNET);
		FactoryProtocol scp = Connection.getInstance(ConnectionType.SCP);
		FactoryProtocol ftp = Connection.getInstance(ConnectionType.FTP);
		
		
		if(ssh == ssh2) {
			System.out.println(" ssh is equal to ssh2");
		}
		ssh.send(" testing ssh ");
		telnet.send("Testing telnet ");
		scp.send("Testing scp");
		
		
		System.out.println(Connection.getCurrentConnections());
		Connection.release(ConnectionType.SSH);
		System.out.println(Connection.getCurrentConnections());
		
		ftp = Connection.getInstance(ConnectionType.FTP);
		System.out.println(Connection.getCurrentConnections());
		
		
		ssh = Connection.getInstance(ConnectionType.SSH);
		ftp = Connection.getInstance(ConnectionType.FTP);
		ftp = Connection.getInstance(ConnectionType.FTP);
		
		ftp = Connection.getInstance(ConnectionType.FTP);
		ftp.send("Testing FTP");
		
		
		
	}

}
