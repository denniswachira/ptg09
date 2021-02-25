//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 10:05:13 PM EAT 
//


package com.dewcis.ptg.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fare"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pickupWaitingTime" type="{http://www.haulmont.com/sherlock/adler}waitingTime" minOccurs="0"/&gt;
 *         &lt;element name="stopsWaitingTime" type="{http://www.haulmont.com/sherlock/adler}waitingTime" minOccurs="0"/&gt;
 *         &lt;element name="adjustments" type="{http://www.haulmont.com/sherlock/adler}priceAdjustment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commonTaxes" type="{http://www.haulmont.com/sherlock/adler}tax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fare", propOrder = {
    "base",
    "pickupWaitingTime",
    "stopsWaitingTime",
    "adjustments",
    "commonTaxes",
    "discount",
    "total",
    "currency"
})
public class Fare {

    @XmlElement(required = true)
    protected BigDecimal base;
    protected WaitingTime pickupWaitingTime;
    protected WaitingTime stopsWaitingTime;
    protected List<PriceAdjustment> adjustments;
    protected List<Tax> commonTaxes;
    protected BigDecimal discount;
    protected BigDecimal total;
    protected String currency;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBase(BigDecimal value) {
        this.base = value;
    }

    /**
     * Gets the value of the pickupWaitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link WaitingTime }
     *     
     */
    public WaitingTime getPickupWaitingTime() {
        return pickupWaitingTime;
    }

    /**
     * Sets the value of the pickupWaitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitingTime }
     *     
     */
    public void setPickupWaitingTime(WaitingTime value) {
        this.pickupWaitingTime = value;
    }

    /**
     * Gets the value of the stopsWaitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link WaitingTime }
     *     
     */
    public WaitingTime getStopsWaitingTime() {
        return stopsWaitingTime;
    }

    /**
     * Sets the value of the stopsWaitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitingTime }
     *     
     */
    public void setStopsWaitingTime(WaitingTime value) {
        this.stopsWaitingTime = value;
    }

    /**
     * Gets the value of the adjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceAdjustment }
     * 
     * 
     */
    public List<PriceAdjustment> getAdjustments() {
        if (adjustments == null) {
            adjustments = new ArrayList<PriceAdjustment>();
        }
        return this.adjustments;
    }

    /**
     * Gets the value of the commonTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getCommonTaxes() {
        if (commonTaxes == null) {
            commonTaxes = new ArrayList<Tax>();
        }
        return this.commonTaxes;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
