//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.08 at 02:46:49 PM PDT 
//


package com.cloud.ucs.schema.listBlade;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="outConfig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="computeBlade" type="{http://org.cloudstack/schema/cloudstack}ComputeBlade"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "outConfig"
})
@XmlRootElement(name = "configResolveDn")
public class ConfigResolveDn {

    @XmlElement(required = true)
    protected ConfigResolveDn.OutConfig outConfig;

    /**
     * Gets the value of the outConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigResolveDn.OutConfig }
     *     
     */
    public ConfigResolveDn.OutConfig getOutConfig() {
        return outConfig;
    }

    /**
     * Sets the value of the outConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigResolveDn.OutConfig }
     *     
     */
    public void setOutConfig(ConfigResolveDn.OutConfig value) {
        this.outConfig = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="computeBlade" type="{http://org.cloudstack/schema/cloudstack}ComputeBlade"/>
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
        "computeBlade"
    })
    public static class OutConfig {

        protected List<ComputeBlade> computeBlade;

        /**
         * Gets the value of the computeBlade property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the computeBlade property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComputeBlade().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComputeBlade }
         * 
         * 
         */
        public List<ComputeBlade> getComputeBlade() {
            if (computeBlade == null) {
                computeBlade = new ArrayList<ComputeBlade>();
            }
            return this.computeBlade;
        }

    }

}