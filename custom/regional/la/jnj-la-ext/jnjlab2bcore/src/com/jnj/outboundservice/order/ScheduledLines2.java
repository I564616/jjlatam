
package com.jnj.outboundservice.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ScheduledLines2 complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ScheduledLines2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoundedQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfirmedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledLines2", propOrder =
{ "lineNumber", "deliveryDate", "roundedQuantity", "confirmedQuantity" })
@XmlRootElement(name = "ScheduledLines2")
public class ScheduledLines2
{

	@XmlElement(name = "LineNumber", required = true)
	protected String lineNumber;
	@XmlElementRef(name = "DeliveryDate", type = JAXBElement.class, required = false)
	protected JAXBElement<String> deliveryDate;
	@XmlElement(name = "RoundedQuantity", required = true)
	protected String roundedQuantity;
	@XmlElementRef(name = "ConfirmedQuantity", type = JAXBElement.class, required = false)
	protected JAXBElement<String> confirmedQuantity;

	/**
	 * Gets the value of the lineNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLineNumber()
	{
		return lineNumber;
	}

	/**
	 * Sets the value of the lineNumber property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setLineNumber(final String value)
	{
		this.lineNumber = value;
	}

	/**
	 * Gets the value of the deliveryDate property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public JAXBElement<String> getDeliveryDate()
	{
		return deliveryDate;
	}

	/**
	 * Sets the value of the deliveryDate property.
	 * 
	 * @param value
	 *           allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public void setDeliveryDate(final JAXBElement<String> value)
	{
		this.deliveryDate = value;
	}

	/**
	 * Gets the value of the roundedQuantity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRoundedQuantity()
	{
		return roundedQuantity;
	}

	/**
	 * Sets the value of the roundedQuantity property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setRoundedQuantity(final String value)
	{
		this.roundedQuantity = value;
	}

	/**
	 * Gets the value of the confirmedQuantity property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public JAXBElement<String> getConfirmedQuantity()
	{
		return confirmedQuantity;
	}

	/**
	 * Sets the value of the confirmedQuantity property.
	 * 
	 * @param value
	 *           allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public void setConfirmedQuantity(final JAXBElement<String> value)
	{
		this.confirmedQuantity = value;
	}

}
