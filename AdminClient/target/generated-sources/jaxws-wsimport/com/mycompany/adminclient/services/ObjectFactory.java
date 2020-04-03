
package com.mycompany.adminclient.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.adminclient.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteVideosResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "deleteVideosResponse");
    private final static QName _AddVideosResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "addVideosResponse");
    private final static QName _GetallVideosResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "getallVideosResponse");
    private final static QName _Streamingvideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "streamingvideos");
    private final static QName _UpdateVideosResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "updateVideosResponse");
    private final static QName _DeleteVideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "deleteVideos");
    private final static QName _GetallVideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "getallVideos");
    private final static QName _GetVideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "getVideos");
    private final static QName _GetVideosResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "getVideosResponse");
    private final static QName _GetVideosByTitle_QNAME = new QName("http://services.soapservices.mycompany.com/", "getVideosByTitle");
    private final static QName _AddVideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "addVideos");
    private final static QName _UpdateVideos_QNAME = new QName("http://services.soapservices.mycompany.com/", "updateVideos");
    private final static QName _GetVideosByTitleResponse_QNAME = new QName("http://services.soapservices.mycompany.com/", "getVideosByTitleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.adminclient.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetallVideos }
     * 
     */
    public GetallVideos createGetallVideos() {
        return new GetallVideos();
    }

    /**
     * Create an instance of {@link GetVideos }
     * 
     */
    public GetVideos createGetVideos() {
        return new GetVideos();
    }

    /**
     * Create an instance of {@link UpdateVideosResponse }
     * 
     */
    public UpdateVideosResponse createUpdateVideosResponse() {
        return new UpdateVideosResponse();
    }

    /**
     * Create an instance of {@link AddVideosResponse }
     * 
     */
    public AddVideosResponse createAddVideosResponse() {
        return new AddVideosResponse();
    }

    /**
     * Create an instance of {@link GetallVideosResponse }
     * 
     */
    public GetallVideosResponse createGetallVideosResponse() {
        return new GetallVideosResponse();
    }

    /**
     * Create an instance of {@link Streamingvideos }
     * 
     */
    public Streamingvideos createStreamingvideos() {
        return new Streamingvideos();
    }

    /**
     * Create an instance of {@link DeleteVideosResponse }
     * 
     */
    public DeleteVideosResponse createDeleteVideosResponse() {
        return new DeleteVideosResponse();
    }

    /**
     * Create an instance of {@link DeleteVideos }
     * 
     */
    public DeleteVideos createDeleteVideos() {
        return new DeleteVideos();
    }

    /**
     * Create an instance of {@link GetVideosByTitleResponse }
     * 
     */
    public GetVideosByTitleResponse createGetVideosByTitleResponse() {
        return new GetVideosByTitleResponse();
    }

    /**
     * Create an instance of {@link AddVideos }
     * 
     */
    public AddVideos createAddVideos() {
        return new AddVideos();
    }

    /**
     * Create an instance of {@link UpdateVideos }
     * 
     */
    public UpdateVideos createUpdateVideos() {
        return new UpdateVideos();
    }

    /**
     * Create an instance of {@link GetVideosByTitle }
     * 
     */
    public GetVideosByTitle createGetVideosByTitle() {
        return new GetVideosByTitle();
    }

    /**
     * Create an instance of {@link GetVideosResponse }
     * 
     */
    public GetVideosResponse createGetVideosResponse() {
        return new GetVideosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "deleteVideosResponse")
    public JAXBElement<DeleteVideosResponse> createDeleteVideosResponse(DeleteVideosResponse value) {
        return new JAXBElement<DeleteVideosResponse>(_DeleteVideosResponse_QNAME, DeleteVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "addVideosResponse")
    public JAXBElement<AddVideosResponse> createAddVideosResponse(AddVideosResponse value) {
        return new JAXBElement<AddVideosResponse>(_AddVideosResponse_QNAME, AddVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetallVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getallVideosResponse")
    public JAXBElement<GetallVideosResponse> createGetallVideosResponse(GetallVideosResponse value) {
        return new JAXBElement<GetallVideosResponse>(_GetallVideosResponse_QNAME, GetallVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Streamingvideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "streamingvideos")
    public JAXBElement<Streamingvideos> createStreamingvideos(Streamingvideos value) {
        return new JAXBElement<Streamingvideos>(_Streamingvideos_QNAME, Streamingvideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "updateVideosResponse")
    public JAXBElement<UpdateVideosResponse> createUpdateVideosResponse(UpdateVideosResponse value) {
        return new JAXBElement<UpdateVideosResponse>(_UpdateVideosResponse_QNAME, UpdateVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "deleteVideos")
    public JAXBElement<DeleteVideos> createDeleteVideos(DeleteVideos value) {
        return new JAXBElement<DeleteVideos>(_DeleteVideos_QNAME, DeleteVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetallVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getallVideos")
    public JAXBElement<GetallVideos> createGetallVideos(GetallVideos value) {
        return new JAXBElement<GetallVideos>(_GetallVideos_QNAME, GetallVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getVideos")
    public JAXBElement<GetVideos> createGetVideos(GetVideos value) {
        return new JAXBElement<GetVideos>(_GetVideos_QNAME, GetVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getVideosResponse")
    public JAXBElement<GetVideosResponse> createGetVideosResponse(GetVideosResponse value) {
        return new JAXBElement<GetVideosResponse>(_GetVideosResponse_QNAME, GetVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getVideosByTitle")
    public JAXBElement<GetVideosByTitle> createGetVideosByTitle(GetVideosByTitle value) {
        return new JAXBElement<GetVideosByTitle>(_GetVideosByTitle_QNAME, GetVideosByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "addVideos")
    public JAXBElement<AddVideos> createAddVideos(AddVideos value) {
        return new JAXBElement<AddVideos>(_AddVideos_QNAME, AddVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "updateVideos")
    public JAXBElement<UpdateVideos> createUpdateVideos(UpdateVideos value) {
        return new JAXBElement<UpdateVideos>(_UpdateVideos_QNAME, UpdateVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservices.mycompany.com/", name = "getVideosByTitleResponse")
    public JAXBElement<GetVideosByTitleResponse> createGetVideosByTitleResponse(GetVideosByTitleResponse value) {
        return new JAXBElement<GetVideosByTitleResponse>(_GetVideosByTitleResponse_QNAME, GetVideosByTitleResponse.class, null, value);
    }

}
