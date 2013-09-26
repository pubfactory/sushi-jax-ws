
package org.niso.schemas.counter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the customer whose data the report represents.
 * 
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.niso.org/schemas/counter}Organization">
 *       &lt;sequence>
 *         &lt;element name="Consortium" type="{http://www.niso.org/schemas/counter}Consortium" minOccurs="0"/>
 *         &lt;element name="InstitutionalIdentifier" type="{http://www.niso.org/schemas/counter}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "consortium",
    "institutionalIdentifier"
})
@XmlSeeAlso({
    org.niso.schemas.counter.Report.Customer.class
})
public class Customer
    extends Organization
{

    @XmlElement(name = "Consortium")
    protected Consortium consortium;
    @XmlElement(name = "InstitutionalIdentifier")
    protected List<Identifier> institutionalIdentifier;

    /**
     * Gets the value of the consortium property.
     * 
     * @return
     *     possible object is
     *     {@link Consortium }
     *     
     */
    public Consortium getConsortium() {
        return consortium;
    }

    /**
     * Sets the value of the consortium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consortium }
     *     
     */
    public void setConsortium(Consortium value) {
        this.consortium = value;
    }

    /**
     * Gets the value of the institutionalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutionalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstitutionalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getInstitutionalIdentifier() {
        if (institutionalIdentifier == null) {
            institutionalIdentifier = new ArrayList<Identifier>();
        }
        return this.institutionalIdentifier;
    }

}
