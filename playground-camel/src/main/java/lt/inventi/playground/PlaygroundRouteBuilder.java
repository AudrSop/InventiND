package lt.inventi.playground;


import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(EchoInput.class);
        DataFormat jaxBDataFormat = new JaxbDataFormat(ctx);
        from("cxf:bean:pingPongEndpoint").unmarshal(jaxBDataFormat).to("log:info");
    }
}
