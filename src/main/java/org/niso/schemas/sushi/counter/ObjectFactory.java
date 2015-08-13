
package org.niso.schemas.sushi.counter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.niso.schemas.sushi.ReportRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.niso.schemas.sushi.counter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReportResponse_QNAME = new QName("http://www.niso.org/schemas/sushi/counter", "ReportResponse");
    private final static QName _ReportRequest_QNAME = new QName("http://www.niso.org/schemas/sushi/counter", "ReportRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.niso.schemas.sushi.counter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CounterReportResponse }
     * 
     */
    public CounterReportResponse createCounterReportResponse() {
        return new CounterReportResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounterReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi/counter", name = "ReportResponse")
    public JAXBElement<CounterReportResponse> createReportResponse(CounterReportResponse value) {
        return new JAXBElement<CounterReportResponse>(_ReportResponse_QNAME, CounterReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi/counter", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequest_QNAME, ReportRequest.class, null, value);
    }

}
