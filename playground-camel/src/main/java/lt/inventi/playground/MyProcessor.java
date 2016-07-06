package lt.inventi.playground;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by Burbulas on 2016-07-07.
 */
public class MyProcessor implements Processor {

    PingPongService pingPongService;

    @Override
    public void process(Exchange exchange) throws Exception {

        pingPongService.echoInput("gvhjm");

    }
}
