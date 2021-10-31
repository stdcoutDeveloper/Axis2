package hi;

import javax.xml.ws.BindingProvider;

import hi.clientAxis2.Hi;
import hi.clientAxis2.HiPortType;

public class AxisClient {

	public static void main(String[] args) {
		final String endpoint = "http://localhost:8080/axis2/services/hi";

		HiPortType port = new Hi().getHiHttpSoap11Endpoint();

		// Override the endpoint in the wsimport-derived classes.
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

		System.out.println(port.echo(null));
		System.out.println(port.echo("Peter Parker"));
	}
}