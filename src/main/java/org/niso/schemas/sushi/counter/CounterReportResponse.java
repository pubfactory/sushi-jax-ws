
package org.niso.schemas.sushi.counter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.niso.schemas.counter.Reports;
import org.niso.schemas.sushi.ReportResponse;


/**
 * This is the actual response expected from a COUNTER_SUSHI service. A combination of the SUSHI ReportResponse with the COUNTER "Report" added. NOTE: The ReportRequest and ReportResponse are defined in the SUSHI1_6.xsd and the COUNTER report is defined in the Counter4_0.xsd.
 * 
 * <p>Java class for CounterReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.niso.org/schemas/sushi}ReportResponse">
 *       &lt;sequence>
 *         &lt;element name="Report" type="{http://www.niso.org/schemas/counter}Reports"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterReportResponse", propOrder = {
    "report"
})
public class CounterReportResponse
    extends ReportResponse
{

    @XmlElement(name = "Report", required = true, nillable = true)
    protected Reports report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Reports }
     *     
     */
    public Reports getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reports }
     *     
     */
    public void setReport(Reports value) {
        this.report = value;
    }

}
