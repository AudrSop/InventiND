package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
         from("file://../?fileName=MyFile.txt&charset=utf-8&noop=true")
                .to("activemq:queue:dummy?asyncConsumer=true").log("${body} First Thread");

         from("activemq:queue:dummy").delay(200).split(body().tokenize("\\n"), new AggregationCounter()).log("${body} Second Thread").end()
                 .to("file://../?fileName=${file:name.noext}-result.${file:ext}&charset=utf-8");
    }
}
