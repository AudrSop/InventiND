package lt.inventi.playground;


import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.builder.xml.Namespaces;

public class PlaygroundRouteBuilder extends RouteBuilder {
    Namespaces ns = new Namespaces("pin", "http://pingpong.bpel.tps");
    @Override
    public void configure() throws Exception {
        from("cxf:bean:pingPongEndpoint").log("${body}").setHeader("coolHeader")
                .xpath("/pin:echoInput/pin:input/text()", String.class, ns).to("log:info")
                .setBody(simple("<element>" + "${header.coolHeader}" + "</element>")).to("log:info");
    }
}
