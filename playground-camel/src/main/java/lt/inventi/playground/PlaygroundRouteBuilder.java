package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://myTimer?fixedRate=true&period=2000").bean(FirstBean.class, "helloWorldMethod");
    }
}
