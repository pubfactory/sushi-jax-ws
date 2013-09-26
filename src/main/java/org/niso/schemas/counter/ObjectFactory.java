
package org.niso.schemas.counter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.niso.schemas.counter package. 
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

    private final static QName _Reports_QNAME = new QName("http://www.niso.org/schemas/counter", "Reports");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.niso.schemas.counter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link Reports }
     * 
     */
    public Reports createReports() {
        return new Reports();
    }

    /**
     * Create an instance of {@link org.niso.schemas.counter.Customer }
     * 
     */
    public org.niso.schemas.counter.Customer createCustomer() {
        return new org.niso.schemas.counter.Customer();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link Metric }
     * 
     */
    public Metric createMetric() {
        return new Metric();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ReportItem }
     * 
     */
    public ReportItem createReportItem() {
        return new ReportItem();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Consortium }
     * 
     */
    public Consortium createConsortium() {
        return new Consortium();
    }

    /**
     * Create an instance of {@link PerformanceCounter }
     * 
     */
    public PerformanceCounter createPerformanceCounter() {
        return new PerformanceCounter();
    }

    /**
     * Create an instance of {@link IPAddress }
     * 
     */
    public IPAddress createIPAddress() {
        return new IPAddress();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Report.Customer }
     * 
     */
    public Report.Customer createReportCustomer() {
        return new Report.Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.niso.org/schemas/counter", name = "Reports")
    public JAXBElement<Reports> createReports(Reports value) {
        return new JAXBElement<Reports>(_Reports_QNAME, Reports.class, null, value);
    }

}
