package webservice;
import java.net.InetAddress;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		try { 
			String url = "http://"+InetAddress.getLocalHost().getHostAddress()+":7777/ws/person";
			Endpoint.publish(url, new PersonServiceImpl()); 
			System.out.println(url);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
