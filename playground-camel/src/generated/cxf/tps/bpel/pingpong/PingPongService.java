package tps.bpel.pingpong;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2016-07-05T20:49:26.791+03:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "PingPongService", 
                  wsdlLocation = "file:/C:/Users/Burbulas/InventiND/playground-camel/src/main/resources/PingPong.wsdl",
                  targetNamespace = "http://pingpong.bpel.tps") 
public class PingPongService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://pingpong.bpel.tps", "PingPongService");
    public final static QName PingPong = new QName("http://pingpong.bpel.tps", "PingPong");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Burbulas/InventiND/playground-camel/src/main/resources/PingPong.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PingPongService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Burbulas/InventiND/playground-camel/src/main/resources/PingPong.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PingPongService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PingPongService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PingPongService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PingPongService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PingPongService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PingPongService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PingPong
     */
    @WebEndpoint(name = "PingPong")
    public PingPong getPingPong() {
        return super.getPort(PingPong, PingPong.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PingPong
     */
    @WebEndpoint(name = "PingPong")
    public PingPong getPingPong(WebServiceFeature... features) {
        return super.getPort(PingPong, PingPong.class, features);
    }

}
