//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 10:05:13 PM EAT 
//


package com.dewcis.ptg.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationResult" type="{http://www.haulmont.com/sherlock/adler}validationMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobValidationResponse", propOrder = {
    "validationResult"
})
@XmlSeeAlso({
    QuotationResponse.class,
    DelayResponse.class,
    BookJobResponse.class,
    ReceiptResponse.class
})
public class JobValidationResponse
    extends Response
{

    protected List<ValidationMessage> validationResult;

    /**
     * Gets the value of the validationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationMessage }
     * 
     * 
     */
    public List<ValidationMessage> getValidationResult() {
        if (validationResult == null) {
            validationResult = new ArrayList<ValidationMessage>();
        }
        return this.validationResult;
    }

}
