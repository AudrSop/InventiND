package lt.inventi.playground;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by dev on 16.7.4.
 */

@WebService
public interface PingPongService {

    String saySomething(@WebParam(name="text") String text);
}
