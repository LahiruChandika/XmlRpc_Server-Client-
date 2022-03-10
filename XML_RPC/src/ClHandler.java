
public class ClHandler {
	public String execute(String dbName, Integer i, String a, String b, String c, String d, String e){
        System.out.println("Got inputs: "+dbName+", "+i+", "+a+", "+b+", "+c+", "+d+", "+e);
        return "<?xml version=\"1.0\"> <test>testmail@testdomain.com</test>";
    }
	
//	public String cliPort(String ip , Integer port){
//		System.out.println("Ip address : "+ip+"\n"+"Port : " +port);
//    	return "Ip address: "+ip+" \n"+"Port: "+port; 			
//    }
	public String portNum(String portN) {
		System.out.println("Port number : "+portN);
		return "Port number : "+portN;
	}
}
