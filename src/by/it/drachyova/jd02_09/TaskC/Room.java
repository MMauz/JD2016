//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 07:49:17 PM EET 
//


package by.it.drachyova.jd02_09.TaskC;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Room complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room", propOrder = {
        "type",
        "area",
        "price"
})
public class Room {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Area", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger area;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setArea(BigInteger value) {
        this.area = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "\n" + "Room type " + type + " area " + area + " m\u00B2" + " price " + price + "$";
    }
}