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
 * <p>Java class for amendJobRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="amendJobRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.haulmont.com/sherlock/adler}request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="job" type="{http://www.haulmont.com/sherlock/adler}finalJob"/&gt;
 *         &lt;element name="senderJobInfo" type="{http://www.haulmont.com/sherlock/adler}jobInfo"/&gt;
 *         &lt;element name="receiverJobInfo" type="{http://www.haulmont.com/sherlock/adler}jobInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amendJobRequest", propOrder = {
    "job",
    "senderJobInfo",
    "receiverJobInfo"
})
public class AmendJobRequest
    extends Request
{

    @XmlElement(required = true)
    protected FinalJob job;
    @XmlElement(required = true)
    protected JobInfo senderJobInfo;
    @XmlElement(required = true)
    protected JobInfo receiverJobInfo;

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link FinalJob }
     *     
     */
    public FinalJob getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalJob }
     *     
     */
    public void setJob(FinalJob value) {
        this.job = value;
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

}