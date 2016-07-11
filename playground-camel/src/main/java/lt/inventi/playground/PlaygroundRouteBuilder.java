package lt.inventi.playground;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import static sun.invoke.util.VerifyAccess.getPackageName;


public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        JaxbDataFormat qadJaxb = new JaxbDataFormat(getPackageName(lt.inventi.playground.ObjectFactory.class));

        from("cxf:bean:pingPongEndpoint").unmarshal(qadJaxb).to("log:info").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
              EchoInput payload = exchange.getIn().getBody(EchoInput.class);
                EchoInputResponse myResponse = new EchoInputResponse();
                myResponse.setEchoInputReturn(payload.getInput());
                exchange.getOut().setBody(myResponse);
            }
        }).to("log:info");
    }
}
