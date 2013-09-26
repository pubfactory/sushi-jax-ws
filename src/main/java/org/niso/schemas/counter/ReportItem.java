
package org.niso.schemas.counter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The container for usage data and other information related to an item such as a journal, book, database, etc.
 * 
 * <p>Java class for ReportItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemIdentifier" type="{http://www.niso.org/schemas/counter}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemPublisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemDataType" type="{http://www.niso.org/schemas/counter}DataType"/>
 *         &lt;element name="ItemPerformance" type="{http://www.niso.org/schemas/counter}Metric" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItem", propOrder = {
    "itemIdentifier",
    "itemPlatform",
    "itemPublisher",
    "itemName",
    "itemDataType",
    "itemPerformance"
})
public class ReportItem {

    @XmlElement(name = "ItemIdentifier")
    protected List<Identifier> itemIdentifier;
    @XmlElement(name = "ItemPlatform", required = true)
    protected String itemPlatform;
    @XmlElement(name = "ItemPublisher")
    protected String itemPublisher;
    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "ItemDataType", required = true)
    protected DataType itemDataType;
    @XmlElement(name = "ItemPerformance", required = true)
    protected List<Metric> itemPerformance;

    /**
     * Gets the value of the itemIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getItemIdentifier() {
        if (itemIdentifier == null) {
            itemIdentifier = new ArrayList<Identifier>();
        }
        return this.itemIdentifier;
    }

    /**
     * Gets the value of the itemPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPlatform() {
        return itemPlatform;
    }

    /**
     * Sets the value of the itemPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPlatform(String value) {
        this.itemPlatform = value;
    }

    /**
     * Gets the value of the itemPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPublisher() {
        return itemPublisher;
    }

    /**
     * Sets the value of the itemPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPublisher(String value) {
        this.itemPublisher = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getItemDataType() {
        return itemDataType;
    }

    /**
     * Sets the value of the itemDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setItemDataType(DataType value) {
        this.itemDataType = value;
    }

    /**
     * Gets the value of the itemPerformance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPerformance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metric }
     * 
     * 
     */
    public List<Metric> getItemPerformance() {
        if (itemPerformance == null) {
            itemPerformance = new ArrayList<Metric>();
        }
        return this.itemPerformance;
    }

}
