
package org.niso.schemas.sushi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.niso.schemas.sushi.counter.CounterReportResponse;


/**
 * <p>Java class for ReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exception" type="{http://www.niso.org/schemas/sushi}Exception" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Requestor" type="{http://www.niso.org/schemas/sushi}Requestor"/>
 *         &lt;element name="CustomerReference" type="{http://www.niso.org/schemas/sushi}CustomerReference"/>
 *         &lt;element name="ReportDefinition" type="{http://www.niso.org/schemas/sushi}ReportDefinition"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResponse", propOrder = {
    "exception",
    "requestor",
    "customerReference",
    "reportDefinition"
})
@XmlSeeAlso({
    CounterReportResponse.class
})
public class ReportResponse {

    @XmlElement(name = "Exception", nillable = true)
    protected List<Exception> exception;
    @XmlElement(name = "Requestor", required = true)
    protected Requestor requestor;
    @XmlElement(name = "CustomerReference", required = true)
    protected CustomerReference customerReference;
    @XmlElement(name = "ReportDefinition", required = true)
    protected ReportDefinition reportDefinition;
    @XmlAttribute(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exception }
     * 
     * 
     */
    public List<Exception> getException() {
        if (exception == null) {
            exception = new ArrayList<Exception>();
        }
        return this.exception;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link Requestor }
     *     
     */
    public Requestor getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requestor }
     *     
     */
    public void setRequestor(Requestor value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReference }
     *     
     */
    public CustomerReference getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReference }
     *     
     */
    public void setCustomerReference(CustomerReference value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getReportDefinition() {
        return reportDefinition;
    }

    /**
     * Sets the value of the reportDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(ReportDefinition value) {
        this.reportDefinition = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
