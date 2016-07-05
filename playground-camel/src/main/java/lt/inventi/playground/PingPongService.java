package lt.inventi.playground;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by dev on 16.7.4.
 */

@WebService
public interface PingPongService {

    @WebMethod(operationName = "echoInput")
    String echoInput(@WebParam(name="input") String input);
}
