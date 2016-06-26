package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
         from("file://../?fileName=MyFile.txt&charset=utf-8&noop=true")
                .split(body().tokenize("\\n"), 
                                new AggregationCounterClass()).log("${body}").end()
                .to("file://../?fileName=${file:name.noext}-result.${file:ext}&charset=utf-8");
        
    }
}
