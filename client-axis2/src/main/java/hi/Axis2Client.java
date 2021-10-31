package hi;

import hi.hiClient.HiStub;
import hi.hiClient.HiStub.Echo;
import hi.hiClient.HiStub.EchoResponse;

public class Axis2Client {

	public static void main(String[] args) {
		try {
			HiStub stub = new HiStub("http://localhost:8080/axis2/services/hi");
			
			Echo echo1 = new Echo();
			EchoResponse response1 = stub.echo(echo1);
			System.out.println(response1.get_return());
			
			Echo echo2 = new Echo();
			echo2.setArgs0("Harry Potter");
			EchoResponse response2 = stub.echo(echo2);
			System.out.println(response2.get_return());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
