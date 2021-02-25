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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for jobStatusChangedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobStatusChangedRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receiverJobInfo" type="{http://www.haulmont.com/sherlock/adler}jobInfo"/&gt;
 *         &lt;element name="senderJobInfo" type="{http://www.haulmont.com/sherlock/adler}jobInfo"/&gt;
 *         &lt;element name="newStatus" type="{http://www.haulmont.com/sherlock/adler}jobStatus"/&gt;
 *         &lt;element name="driver" type="{http://www.haulmont.com/sherlock/adler}jobDriverInfo" minOccurs="0"/&gt;
 *         &lt;element name="driverEta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobStatusChangedRequest", propOrder = {
    "receiverJobInfo",
    "senderJobInfo",
    "newStatus",
    "driver",
    "driverEta"
})
public class JobStatusChangedRequest
    extends Request
{

    @XmlElement(required = true)
    protected JobInfo receiverJobInfo;
    @XmlElement(required = true)
    protected JobInfo senderJobInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JobStatus newStatus;
    protected JobDriverInfo driver;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar driverEta;

    /**
     * Gets the value of the receiverJobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo }
     *     
     */
    public JobInfo getReceiverJobInfo() {
        return receiverJobInfo;
    }

    /**
     * Sets the value of the receiverJobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo }
     *     
     */
    public void setReceiverJobInfo(JobInfo value) {
        this.receiverJobInfo = value;
    }

    /**
     * Gets the value of the senderJobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo }
     *     
     */
    public JobInfo getSenderJobInfo() {
        return senderJobInfo;
    }

    /**
     * Sets the value of the senderJobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo }
     *     
     */
    public void setSenderJobInfo(JobInfo value) {
        this.senderJobInfo = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatus }
     *     
     */
    public JobStatus getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatus }
     *     
     */
    public void setNewStatus(JobStatus value) {
        this.newStatus = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link JobDriverInfo }
     *     
     */
    public JobDriverInfo getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDriverInfo }
     *     
     */
    public void setDriver(JobDriverInfo value) {
        this.driver = value;
    }

    /**
     * Gets the value of the driverEta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDriverEta() {
        return driverEta;
    }

    /**
     * Sets the value of the driverEta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDriverEta(XMLGregorianCalendar value) {
        this.driverEta = value;
    }

}
