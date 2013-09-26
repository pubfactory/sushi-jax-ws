
package org.niso.schemas.sushi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Info"/>
 *     &lt;enumeration value="Debug"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Fatal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionSeverity")
@XmlEnum
public enum ExceptionSeverity {


    /**
     * Info type of severity that provides more information about the response. Can be included in a chain of other severity levels.
     * 
     */
    @XmlEnumValue("Info")
    INFO("Info"),

    /**
     * Debug type of severity that provides debugging information about the response. Can be included in a chain of other severity levels.
     * 
     */
    @XmlEnumValue("Debug")
    DEBUG("Debug"),

    /**
     * Warning type of severity that does not interrupt the completion of the transaction (defined as: request->data->response) but gives more information about the response. It could be followed by more exceptions (Info, Debug).
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * Error type of severity that would return no payload. It could be followed by more exceptions (Info, Debug).
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * Fatal type of severity that would return no payload. It could be followed by more exceptions (Info, Debug).
     * 
     */
    @XmlEnumValue("Fatal")
    FATAL("Fatal");
    private final String value;

    ExceptionSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionSeverity fromValue(String v) {
        for (ExceptionSeverity c: ExceptionSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
