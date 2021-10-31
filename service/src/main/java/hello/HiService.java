package hello;

//service
public class HiService {

	// service operation
	public String echo(String name) {
		String msg = (name == null || name.length() < 1) ? "Hello, world!" : "Hello, " + name + "!";
		return msg;
	}
}
