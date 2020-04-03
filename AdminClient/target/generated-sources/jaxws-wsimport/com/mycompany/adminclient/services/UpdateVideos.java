
package com.mycompany.adminclient.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateVideos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateVideos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="video" type="{http://services.soapservices.mycompany.com/}streamingvideos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVideos", propOrder = {
    "video"
})
public class UpdateVideos {

    protected Streamingvideos video;

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Streamingvideos }
     *     
     */
    public Streamingvideos getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streamingvideos }
     *     
     */
    public void setVideo(Streamingvideos value) {
        this.video = value;
    }

}
