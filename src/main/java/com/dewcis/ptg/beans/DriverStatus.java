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
 * <p>Java class for driverStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="driverStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="LOGGED_OFF"/&gt;
 *     &lt;enumeration value="EMPTY"/&gt;
 *     &lt;enumeration value="RANK"/&gt;
 *     &lt;enumeration value="ON_BREAK"/&gt;
 *     &lt;enumeration value="GOING_HOME"/&gt;
 *     &lt;enumeration value="DOING_JOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "driverStatus")
@XmlEnum
public enum DriverStatus {

    UNKNOWN,
    LOGGED_OFF,
    EMPTY,
    RANK,
    ON_BREAK,
    GOING_HOME,
    DOING_JOB;

    public String value() {
        return name();
    }

    public static DriverStatus fromValue(String v) {
        return valueOf(v);
    }

}
