
package com.mycompany.adminclient.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VideoService", targetNamespace = "http://services.soapservices.mycompany.com/", wsdlLocation = "http://localhost:8080/SOAPServices/VideoService?wsdl")
public class VideoService_Service
    extends Service
{

    private final static URL VIDEOSERVICE_WSDL_LOCATION;
    private final static WebServiceException VIDEOSERVICE_EXCEPTION;
    private final static QName VIDEOSERVICE_QNAME = new QName("http://services.soapservices.mycompany.com/", "VideoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPServices/VideoService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIDEOSERVICE_WSDL_LOCATION = url;
        VIDEOSERVICE_EXCEPTION = e;
    }

    public VideoService_Service() {
        super(__getWsdlLocation(), VIDEOSERVICE_QNAME);
    }

    public VideoService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIDEOSERVICE_QNAME, features);
    }

    public VideoService_Service(URL wsdlLocation) {
        super(wsdlLocation, VIDEOSERVICE_QNAME);
    }

    public VideoService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIDEOSERVICE_QNAME, features);
    }

    public VideoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VideoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VideoService
     */
    @WebEndpoint(name = "VideoServicePort")
    public VideoService getVideoServicePort() {
        return super.getPort(new QName("http://services.soapservices.mycompany.com/", "VideoServicePort"), VideoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VideoService
     */
    @WebEndpoint(name = "VideoServicePort")
    public VideoService getVideoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.soapservices.mycompany.com/", "VideoServicePort"), VideoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIDEOSERVICE_EXCEPTION!= null) {
            throw VIDEOSERVICE_EXCEPTION;
        }
        return VIDEOSERVICE_WSDL_LOCATION;
    }

}
