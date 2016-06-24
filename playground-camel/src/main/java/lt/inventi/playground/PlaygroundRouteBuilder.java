package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        FirstBean testBean = new FirstBean();
        from("timer://myTimer?fixedRate=true&period=2000").bean(testBean, "randomIntGenerator").choice()
                .when(simple("${body} <= 3"))
                    .to("bean:firstBean?method=helloWorldMethod(${body})")
                .when(simple("${body} <= 7"))
                    .to("bean:firstBean?method=helloVilniusMethod(${body})")
                .otherwise()
                    .to("bean:firstBean?method=helloEveryoneMethod(${body})");
    }
}
