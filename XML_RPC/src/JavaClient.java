import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.URL;

public class JavaClient {
    public static void main(String args[]) throws Exception {
        XmlRpcClientConfigImpl cf = new XmlRpcClientConfigImpl();
        cf.setServerURL(new URL("http://test.dev:8080/xmlrpc/object"));
        cf.setBasicUserName("admin");
        cf.setBasicPassword("m_demo");
        cf.setConnectionTimeout(60000);
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(cf);
        Object[] params = new Object[] {"dbname",1,"m_demo","res.partner","partner_sync_openerp","kapil5drd@bxiz","22"};
        String s =(String)client.execute("handler.execute", params);
        System.out.println(s);
         
    }
}