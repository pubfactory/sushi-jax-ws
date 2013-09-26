package com.safaribooks.ifpress.amx.reporting.sushiservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-25T15:26:16.957-04:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "SushiService", name = "SushiServiceInterface")
@XmlSeeAlso({org.niso.schemas.sushi.counter.ObjectFactory.class, org.niso.schemas.sushi.ObjectFactory.class, org.niso.schemas.counter.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SushiServiceInterface {

    @WebResult(name = "ReportResponse", targetNamespace = "http://www.niso.org/schemas/sushi/counter", partName = "messagePart")
    @WebMethod(operationName = "GetReport", action = "SushiService:GetReportIn")
    public org.niso.schemas.sushi.counter.CounterReportResponse getReport(
        @WebParam(partName = "messagePart", name = "ReportRequest", targetNamespace = "http://www.niso.org/schemas/sushi/counter")
        org.niso.schemas.sushi.ReportRequest messagePart
    );
}
