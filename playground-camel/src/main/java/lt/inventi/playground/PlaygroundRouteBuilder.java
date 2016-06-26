package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://../?fileName=MyFile.txt&charset=utf-8&noop=true")
                .choice()
                    .when().simple("${body} != ''")
                        .to("bean:lowerCase?method=toLower(${body})")
                        .setBody(body().append(" My random additional Worlds!"))
                        .to("file://../?fileName=${file:name.noext}-result.${file:ext}&charset=utf-8")
                    .otherwise()
                        .to("file://../?fileName=${file:name.noext}-result.${file:ext}&charset=utf-8");
    }
}
