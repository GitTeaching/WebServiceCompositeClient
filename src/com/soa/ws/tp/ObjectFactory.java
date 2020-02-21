
package com.soa.ws.tp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soa.ws.tp package. 
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

    private final static QName _VerifCategProductResponse_QNAME = new QName("http://tp.ws.soa.com/", "verifCategProductResponse");
    private final static QName _VerifCategProduct_QNAME = new QName("http://tp.ws.soa.com/", "verifCategProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soa.ws.tp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerifCategProductResponse }
     * 
     */
    public VerifCategProductResponse createVerifCategProductResponse() {
        return new VerifCategProductResponse();
    }

    /**
     * Create an instance of {@link VerifCategProduct }
     * 
     */
    public VerifCategProduct createVerifCategProduct() {
        return new VerifCategProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifCategProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.com/", name = "verifCategProductResponse")
    public JAXBElement<VerifCategProductResponse> createVerifCategProductResponse(VerifCategProductResponse value) {
        return new JAXBElement<VerifCategProductResponse>(_VerifCategProductResponse_QNAME, VerifCategProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifCategProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp.ws.soa.com/", name = "verifCategProduct")
    public JAXBElement<VerifCategProduct> createVerifCategProduct(VerifCategProduct value) {
        return new JAXBElement<VerifCategProduct>(_VerifCategProduct_QNAME, VerifCategProduct.class, null, value);
    }

}
