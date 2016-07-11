package lt.inventi.playground;


import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("cxf:bean:pingPongEndpoint").log("${body}")
                .setHeader("coolHeader", xpath("/pin:echoInput/pin:input/text()").resultType(String.class).namespace("pin", "http://pingpong.bpel.tps"))
                .setBody(simple("<echoInputResponse xmlns=\"http://pingpong.bpel.tps\">" + "<echoInputReturn>" + "${header.coolHeader}"
                        + "</echoInputReturn>" + "</echoInputResponse>")).to("log:info");
    }


}
