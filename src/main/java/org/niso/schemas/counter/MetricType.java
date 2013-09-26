
package org.niso.schemas.counter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetricType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ft_ps"/>
 *     &lt;enumeration value="ft_ps_mobile"/>
 *     &lt;enumeration value="ft_pdf"/>
 *     &lt;enumeration value="ft_pdf_mobile"/>
 *     &lt;enumeration value="ft_html"/>
 *     &lt;enumeration value="ft_html_mobile"/>
 *     &lt;enumeration value="ft_epub"/>
 *     &lt;enumeration value="ft_total"/>
 *     &lt;enumeration value="sectioned_html"/>
 *     &lt;enumeration value="toc"/>
 *     &lt;enumeration value="abstract"/>
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="data_set"/>
 *     &lt;enumeration value="audio"/>
 *     &lt;enumeration value="video"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="podcast"/>
 *     &lt;enumeration value="multimedia"/>
 *     &lt;enumeration value="record_view"/>
 *     &lt;enumeration value="result_click"/>
 *     &lt;enumeration value="search_reg"/>
 *     &lt;enumeration value="search_fed"/>
 *     &lt;enumeration value="turnaway"/>
 *     &lt;enumeration value="no_license"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetricType")
@XmlEnum
public enum MetricType {

    @XmlEnumValue("ft_ps")
    FT_PS("ft_ps"),
    @XmlEnumValue("ft_ps_mobile")
    FT_PS_MOBILE("ft_ps_mobile"),
    @XmlEnumValue("ft_pdf")
    FT_PDF("ft_pdf"),
    @XmlEnumValue("ft_pdf_mobile")
    FT_PDF_MOBILE("ft_pdf_mobile"),
    @XmlEnumValue("ft_html")
    FT_HTML("ft_html"),
    @XmlEnumValue("ft_html_mobile")
    FT_HTML_MOBILE("ft_html_mobile"),
    @XmlEnumValue("ft_epub")
    FT_EPUB("ft_epub"),
    @XmlEnumValue("ft_total")
    FT_TOTAL("ft_total"),
    @XmlEnumValue("sectioned_html")
    SECTIONED_HTML("sectioned_html"),
    @XmlEnumValue("toc")
    TOC("toc"),
    @XmlEnumValue("abstract")
    ABSTRACT("abstract"),
    @XmlEnumValue("reference")
    REFERENCE("reference"),
    @XmlEnumValue("data_set")
    DATA_SET("data_set"),
    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("podcast")
    PODCAST("podcast"),
    @XmlEnumValue("multimedia")
    MULTIMEDIA("multimedia"),
    @XmlEnumValue("record_view")
    RECORD_VIEW("record_view"),
    @XmlEnumValue("result_click")
    RESULT_CLICK("result_click"),
    @XmlEnumValue("search_reg")
    SEARCH_REG("search_reg"),
    @XmlEnumValue("search_fed")
    SEARCH_FED("search_fed"),
    @XmlEnumValue("turnaway")
    TURNAWAY("turnaway"),
    @XmlEnumValue("no_license")
    NO_LICENSE("no_license"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MetricType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetricType fromValue(String v) {
        for (MetricType c: MetricType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
