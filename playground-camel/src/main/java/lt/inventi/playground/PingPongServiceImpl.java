package lt.inventi.playground;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by dev on 16.7.4.
 */

@WebService(endpointInterface = "lt.inventi.playground.PingPongService")
public class PingPongServiceImpl implements PingPongService {


    public String input = "random string";

    @Override
    @WebMethod(operationName = "echoInput")

    public String echoInput(String input) {
        return "Test: " + input;
    }
}
