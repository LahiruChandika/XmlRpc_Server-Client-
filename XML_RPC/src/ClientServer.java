import java.util.Scanner;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class ClientServer {
	private static int port;

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter port number : ");
		port = scan.nextInt();
		
		WebServer wServer;	
		wServer = new WebServer(port);
        XmlRpcServer xrs = wServer.getXmlRpcServer();
        PropertyHandlerMapping ph = new PropertyHandlerMapping();
        ph.addHandler("hand",ClientServer.class);
        xrs.setHandlerMapping(ph);       
        XmlRpcServerConfigImpl serverConfi =
                (XmlRpcServerConfigImpl) xrs.getConfig();      
        serverConfi.setEnabledForExtensions(true);
        serverConfi.setContentLengthOptional(false);
        wServer.start(); 
        
	}
	public String portNum() {
		System.out.println("Port number : "+port);
		return "ClientServer Port number : "+port;
	}
}
