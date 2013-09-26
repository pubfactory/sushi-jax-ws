
package org.niso.schemas.sushi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Input arguments for the report.
 * 
 * <p>Java class for ReportDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UsageDateRange" type="{http://www.niso.org/schemas/sushi}Range"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Release" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinition", propOrder = {
    "filters"
})
public class ReportDefinition {

    @XmlElement(name = "Filters", required = true)
    protected ReportDefinition.Filters filters;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Release", required = true)
    protected String release;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition.Filters }
     *     
     */
    public ReportDefinition.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition.Filters }
     *     
     */
    public void setFilters(ReportDefinition.Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UsageDateRange" type="{http://www.niso.org/schemas/sushi}Range"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usageDateRange"
    })
    public static class Filters {

        @XmlElement(name = "UsageDateRange", required = true)
        protected Range usageDateRange;

        /**
         * Gets the value of the usageDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link Range }
         *     
         */
        public Range getUsageDateRange() {
            return usageDateRange;
        }

        /**
         * Sets the value of the usageDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link Range }
         *     
         */
        public void setUsageDateRange(Range value) {
            this.usageDateRange = value;
        }

    }

}
