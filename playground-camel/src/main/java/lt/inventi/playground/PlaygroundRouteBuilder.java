package lt.inventi.playground;


import org.apache.camel.builder.RouteBuilder;



public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxf:bean:pingPongEndpoint")
                .to("log:info").end();


    }
}
