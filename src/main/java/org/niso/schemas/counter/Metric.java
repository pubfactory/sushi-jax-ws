
package org.niso.schemas.counter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The actual usage details.
 * 
 * <p>Java class for Metric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Metric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.niso.org/schemas/counter}DateRange"/>
 *         &lt;element name="Category" type="{http://www.niso.org/schemas/counter}Category"/>
 *         &lt;element name="Instance" type="{http://www.niso.org/schemas/counter}PerformanceCounter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PubYr" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *       &lt;attribute name="PubYrFrom" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *       &lt;attribute name="PubYrTo" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metric", propOrder = {
    "period",
    "category",
    "instance"
})
public class Metric {

    @XmlElement(name = "Period", required = true)
    protected DateRange period;
    @XmlElement(name = "Category", required = true)
    protected Category category;
    @XmlElement(name = "Instance", required = true)
    protected List<PerformanceCounter> instance;
    @XmlAttribute(name = "PubYr")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar pubYr;
    @XmlAttribute(name = "PubYrFrom")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar pubYrFrom;
    @XmlAttribute(name = "PubYrTo")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar pubYrTo;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setPeriod(DateRange value) {
        this.period = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceCounter }
     * 
     * 
     */
    public List<PerformanceCounter> getInstance() {
        if (instance == null) {
            instance = new ArrayList<PerformanceCounter>();
        }
        return this.instance;
    }

    /**
     * Gets the value of the pubYr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubYr() {
        return pubYr;
    }

    /**
     * Sets the value of the pubYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubYr(XMLGregorianCalendar value) {
        this.pubYr = value;
    }

    /**
     * Gets the value of the pubYrFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubYrFrom() {
        return pubYrFrom;
    }

    /**
     * Sets the value of the pubYrFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubYrFrom(XMLGregorianCalendar value) {
        this.pubYrFrom = value;
    }

    /**
     * Gets the value of the pubYrTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubYrTo() {
        return pubYrTo;
    }

    /**
     * Sets the value of the pubYrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubYrTo(XMLGregorianCalendar value) {
        this.pubYrTo = value;
    }

}
