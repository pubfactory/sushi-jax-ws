
package org.niso.schemas.sushi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.niso.schemas.sushi package. 
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

    private final static QName _ReportRequest_QNAME = new QName("http://www.niso.org/schemas/sushi", "ReportRequest");
    private final static QName _ReportResponse_QNAME = new QName("http://www.niso.org/schemas/sushi", "ReportResponse");
    private final static QName _ExceptionData_QNAME = new QName("http://www.niso.org/schemas/sushi", "Data");
    private final static QName _ExceptionHelpUrl_QNAME = new QName("http://www.niso.org/schemas/sushi", "HelpUrl");
    private final static QName _CustomerReferenceName_QNAME = new QName("http://www.niso.org/schemas/sushi", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.niso.schemas.sushi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportDefinition }
     * 
     */
    public ReportDefinition createReportDefinition() {
        return new ReportDefinition();
    }

    /**
     * Create an instance of {@link ReportRequest }
     * 
     */
    public ReportRequest createReportRequest() {
        return new ReportRequest();
    }

    /**
     * Create an instance of {@link ReportResponse }
     * 
     */
    public ReportResponse createReportResponse() {
        return new ReportResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link CustomerReference }
     * 
     */
    public CustomerReference createCustomerReference() {
        return new CustomerReference();
    }

    /**
     * Create an instance of {@link Requestor }
     * 
     */
    public Requestor createRequestor() {
        return new Requestor();
    }

    /**
     * Create an instance of {@link ReportDefinition.Filters }
     * 
     */
    public ReportDefinition.Filters createReportDefinitionFilters() {
        return new ReportDefinition.Filters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequest_QNAME, ReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "ReportResponse")
    public JAXBElement<ReportResponse> createReportResponse(ReportResponse value) {
        return new JAXBElement<ReportResponse>(_ReportResponse_QNAME, ReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "Data", scope = Exception.class)
    public JAXBElement<Object> createExceptionData(Object value) {
        return new JAXBElement<Object>(_ExceptionData_QNAME, Object.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "HelpUrl", scope = Exception.class)
    public JAXBElement<String> createExceptionHelpUrl(String value) {
        return new JAXBElement<String>(_ExceptionHelpUrl_QNAME, String.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/sushi", name = "Name", scope = CustomerReference.class)
    public JAXBElement<String> createCustomerReferenceName(String value) {
        return new JAXBElement<String>(_CustomerReferenceName_QNAME, String.class, CustomerReference.class, value);
    }

}
