
package hi.clientAxis2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "hiPortType", targetNamespace = "http://hello")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HiPortType {


    /**
     * 
     * @param args0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:echo")
    @WebResult(targetNamespace = "http://hello")
    @RequestWrapper(localName = "echo", targetNamespace = "http://hello", className = "hi.clientAxis2.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://hello", className = "hi.clientAxis2.EchoResponse")
    public String echo(
        @WebParam(name = "args0", targetNamespace = "http://hello")
        String args0);

}
