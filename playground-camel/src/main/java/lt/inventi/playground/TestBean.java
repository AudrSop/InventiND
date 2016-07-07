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
public class TestBean {

 public void inportantMethod (Exchange exchange) {
      String echoInput = "Ahahah";
      exchange.getIn().setBody(echoInput);
 }

}


