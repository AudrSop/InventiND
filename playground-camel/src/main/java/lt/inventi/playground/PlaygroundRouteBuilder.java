package lt.inventi.playground;


import org.apache.camel.builder.RouteBuilder;


public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
  from("cxf:bean:pingPongEndpoint")
          .setBody(simple("random", String.class))

          .to("log:info").log("${body} tirlpirli").end();
  
  //.setHeader("echoInput", simple("<echoInput> random </echoInput>", String.class))
  
  //.setBody(simple("random", String.class))
    }


}
