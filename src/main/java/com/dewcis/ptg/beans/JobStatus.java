//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 10:05:13 PM EAT 
//


package com.dewcis.ptg.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOOKED"/&gt;
 *     &lt;enumeration value="ALLOCATED"/&gt;
 *     &lt;enumeration value="ON_WAY"/&gt;
 *     &lt;enumeration value="AT_PICKUP"/&gt;
 *     &lt;enumeration value="ON_BOARD"/&gt;
 *     &lt;enumeration value="DONE"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="CANCELLED_WITH_CHARGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "jobStatus")
@XmlEnum
public enum JobStatus {

    BOOKED,
    ALLOCATED,
    ON_WAY,
    AT_PICKUP,
    ON_BOARD,
    DONE,
    CANCELLED,
    CANCELLED_WITH_CHARGE;

    public String value() {
        return name();
    }

    public static JobStatus fromValue(String v) {
        return valueOf(v);
    }

}
