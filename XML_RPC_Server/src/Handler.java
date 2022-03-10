public class Handler {
    public String execute(String dbName, Integer i, String a, String b, String c, String d, String e){
        System.out.println("Got inputs: "+dbName+", "+i+", "+a+", "+b+", "+c+", "+d+", "+e);
        return "<?xml version=\"1.0\"> <test>testmail@testdomain.com</test>";
    }
    
    public int test(String dbName, Integer i, String a, String b, String c, String d, String e){
    	return 10; 			
    }
    
    public String name(String dbName, Integer i, String a, String b, String c, String d, String e){
		System.out.println("email : "+d);
		return "Lahiru Chandika";
    }
}