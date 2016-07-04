package lt.inventi.playground;

import org.apache.camel.builder.RouteBuilder;

public class PlaygroundRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start")
                .to("cxf:bean:pingPongEndpoint?wsdlURL=PingPong.wsdl&dataFormat=PAYLOAD");
        
//            from("timer:soapRequestTimer?{options}")
//        .to("cxf:serviceUrl"));
//        .to("jms:queue:someQueue"));


//        from(simpleEndpointURI + "&dataFormat=PAYLOAD").to("log:info").process(new Processor() {
//            @SuppressWarnings("unchecked")
//            public void process(final Exchange exchange) throws Exception {
//                CxfPayload<SoapHeader> requestPayload = exchange.getIn().getBody(CxfPayload.class);
//                List<Source> inElements = requestPayload.getBodySources();
//                List<Source> outElements = new ArrayList<Source>();
//                // You can use a customer toStringConverter to turn a CxfPayLoad message into String as you want
//                String request = exchange.getIn().getBody(String.class);
//                XmlConverter converter = new XmlConverter();
//                String documentString = ECHO_RESPONSE;
//
//                Element in = new XmlConverter().toDOMElement(inElements.get(0));
//                // Just check the element namespace
//                if (!in.getNamespaceURI().equals(ELEMENT_NAMESPACE)) {
//                    throw new IllegalArgumentException("Wrong element namespace");
//                }
//                if (in.getLocalName().equals("echoBoolean")) {
//                    documentString = ECHO_BOOLEAN_RESPONSE;
//                    checkRequest("ECHO_BOOLEAN_REQUEST", request);
//                } else {
//                    documentString = ECHO_RESPONSE;
//                    checkRequest("ECHO_REQUEST", request);
//                }
//                Document outDocument = converter.toDOMDocument(documentString, exchange);
//                outElements.add(new DOMSource(outDocument.getDocumentElement()));
//                // set the payload header with null
//                CxfPayload<SoapHeader> responsePayload = new CxfPayload<SoapHeader>(null, outElements, null);
//                exchange.getOut().setBody(responsePayload);
//            }
//        });
    }
}
