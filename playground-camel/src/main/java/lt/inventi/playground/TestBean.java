package lt.inventi.playground;

import org.apache.camel.Exchange;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.util.List;

/**
 * Created by Burbulas on 2016-07-06.
 */
public class TestBean
        //extends AbstractSoapInterceptor
 {}
//    public SOAPMessage processSOAP(Exchange exchange) {
//        // Since the Camel-CXF endpoint uses a list to store the parameters
//        // and bean component uses the bodyAs expression to get the value
//        // we'll need to deal with the parameters ourself
//        SOAPMessage soapMessage = null;
//        if (soapMessage == null) {
//            System.out.println("Incoming null message detected...");
//            return createDefaultSoapMessage("Greetings from Apache Camel!!!!", "null");
//        }
//
//        try {
//            SOAPPart sp = soapMessage.getSOAPPart();
//            SOAPEnvelope se = sp.getEnvelope();
//            SOAPBody sb = se.getBody();
//            String requestText = sb.getFirstChild().getTextContent();
//            System.out.println(requestText);
//            return createDefaultSoapMessage("Greetings from Apache Camel!!!!", requestText);
//        } catch (Exception e) {
//            System.out.println("Uaa");
//            e.printStackTrace();
//            return createDefaultSoapMessage("Greetings from Apache Camel!!!!", e.getClass().getName());
//        }
//    }
//
//    public static SOAPMessage createDefaultSoapMessage(String responseMessage, String requestMessage) {
//        try {
//            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
//            SOAPBody body = soapMessage.getSOAPPart().getEnvelope().getBody();
//
//            QName payloadName = new QName("http://apache.org/hello_world_soap_http/types", "greetMeResponse", "ns1");
//
//            SOAPBodyElement payload = body.addBodyElement(payloadName);
//
//            SOAPElement message = payload.addChildElement("echoInput");
//
//            message.addTextNode(responseMessage + " Request was  " + requestMessage);
//            return soapMessage;
//        } catch (SOAPException e) {
//            System.out.println("XXXX");
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void handleMessage(SoapMessage message) throws Fault {
//        message.getExchange().put("echoInput", "Bar");
//    }
//}

//  to("bean:testBean?method=processSOAP").
//        process(new Processor() {
//            @Override
//            public void process(Exchange exchange) throws Exception {
//          CxfPayload<SoapHeader> requestPayload = exchange.getIn().getBody(CxfPayload.class);
//        List<Source> inElements = requestPayload.getBodySources();
//        List<Source> outElements = new ArrayList<Source>();
//        // You can use a customer toStringConverter to turn a CxfPayLoad message into String as you want
//        String request = exchange.getIn().getBody(String.class);
//        XmlConverter converter = new XmlConverter();
//        String documentString = "echoBoolean";
//
//        Element in = new XmlConverter().toDOMElement(inElements.get(0));
//
//        Document outDocument = converter.toDOMDocument(documentString, exchange);
//        outElements.add(new DOMSource(outDocument.getDocumentElement()));
//        // set the payload header with null
//        CxfPayload<SoapHeader> responsePayload = new CxfPayload<SoapHeader>(null, outElements, null);
//        exchange.getOut().setBody(responsePayload);
//                    CxfPayload<SoapHeader> payload = exchange.getIn().getBody(CxfPayload.class);
//                    List<Element> elements = payload.getBody();
//
//                    List<SoapHeader> headers = payload.getHeaders();
//            }
//        }).


//
//    private static Exchange sendSimpleMessage1(ProducerTemplate template,
//                                               String endpointUri) {
//
//        final List<String> params = new ArrayList<String>();
//        Map<String, Object> headers = new HashMap<String, Object>();
//        headers.put(CxfConstants.OPERATION_NAME, "getApplication");
//        headers.put("requestObject", new DefaultCxfBinding());
//        params.add("hello world");
//
//        Exchange exchange = template.request(endpointUri, new Processor() {
//            public void process(final Exchange exchange) throws Exception {
//                SOAPMessage soapMessage=createSOAPRequest();
//                exchange.getIn()
//                        .setBody(  soapMessage.getSOAPBody());
//            }
//        });
//        return exchange;
//
//    }
//
//    private static SOAPMessage createSOAPRequest() throws Exception {
//        MessageFactory messageFactory = MessageFactory.newInstance();
//        SOAPMessage soapMessage = messageFactory.createMessage();
//        SOAPPart soapPart = soapMessage.getSOAPPart();
//
//        String serverURI = "http://ws.cdyne.com/";
//
//        // SOAP Envelope
//        SOAPEnvelope envelope = soapPart.getEnvelope();
//        envelope.addNamespaceDeclaration("example", serverURI);
//
//        javax.xml.soap.SOAPBody soapBody = envelope.getBody();
//        SOAPElement soapBodyElem = soapBody.addChildElement("getApplication", "example");
//           /* SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("data", "example");
//            soapBodyElem1.addTextNode("mutantninja@gmail.com");*/
//        MimeHeaders headers = soapMessage.getMimeHeaders();
//        headers.addHeader("SOAPAction", serverURI  + "getApplication");
//
//        soapMessage.saveChanges();
//
//            /* Print the request message */
//        System.out.print("Request SOAP Message = ");
//        soapMessage.writeTo(System.out);
//        System.out.println();
//
//        return soapMessage;
//    }

