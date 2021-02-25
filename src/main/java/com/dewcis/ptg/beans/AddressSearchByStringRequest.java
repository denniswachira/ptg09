//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 10:05:13 PM EAT 
//


package com.dewcis.ptg.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressSearchByStringRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressSearchByStringRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}addressSearchRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autocompleteSessionId" type="{http://www.haulmont.com/sherlock/adler}uuid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressSearchByStringRequest", propOrder = {
    "searchString",
    "autocompleteSessionId"
})
public class AddressSearchByStringRequest
    extends AddressSearchRequest
{

    @XmlElement(required = true)
    protected String searchString;
    protected String autocompleteSessionId;

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the autocompleteSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutocompleteSessionId() {
        return autocompleteSessionId;
    }

    /**
     * Sets the value of the autocompleteSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutocompleteSessionId(String value) {
        this.autocompleteSessionId = value;
    }

}
