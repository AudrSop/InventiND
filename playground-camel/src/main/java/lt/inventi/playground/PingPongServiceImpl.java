package lt.inventi.playground;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by dev on 16.7.4.
 */

@WebService(endpointInterface = "lt.inventi.playground.PingPongService",
        serviceName="PingPongService")
public class PingPongServiceImpl implements PingPongService {
    @Override
    public String saySomething(String text) {
        return text;
    }
}
