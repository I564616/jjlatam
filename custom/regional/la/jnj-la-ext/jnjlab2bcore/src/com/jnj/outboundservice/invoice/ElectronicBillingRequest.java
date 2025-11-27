
package com.jnj.outboundservice.invoice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ElectronicBillingRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ElectronicBillingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElectronicBillingRequest_In" type="{http://itsusmpl00082.jnj.com/SG910_BtB_IN0504_ElectronicBilling_Hybris_Source_v1.webservices:receiveElectronicBillingWS}ElectronicBillingRequest_In"/>
 *         &lt;element name="Header" type="{http://itsusmpl00082.jnj.com/SG910_BtB_IN0504_ElectronicBilling_Hybris_Source_v1.webservices:receiveElectronicBillingWS}BTBControlArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicBillingRequest", propOrder =
{ "electronicBillingRequestIn", "header" })
@XmlRootElement(name = "ElectronicBillingRequest")
public class ElectronicBillingRequest
{

	@XmlElement(name = "ElectronicBillingRequest_In", required = true, nillable = true)
	protected ElectronicBillingRequestIn electronicBillingRequestIn;
	@XmlElementRef(name = "Header", type = JAXBElement.class, required = false)
	protected JAXBElement<BTBControlArea> header;

	/**
	 * Gets the value of the electronicBillingRequestIn property.
	 * 
	 * @return possible object is {@link ElectronicBillingRequestIn }
	 * 
	 */
	public ElectronicBillingRequestIn getElectronicBillingRequestIn()
	{
		return electronicBillingRequestIn;
	}

	/**
	 * Sets the value of the electronicBillingRequestIn property.
	 * 
	 * @param value
	 *           allowed object is {@link ElectronicBillingRequestIn }
	 * 
	 */
	public void setElectronicBillingRequestIn(final ElectronicBillingRequestIn value)
	{
		this.electronicBillingRequestIn = value;
	}

	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link BTBControlArea }{@code >}
	 * 
	 */
	public JAXBElement<BTBControlArea> getHeader()
	{
		return header;
	}

	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *           allowed object is {@link JAXBElement }{@code <}{@link BTBControlArea }{@code >}
	 * 
	 */
	public void setHeader(final JAXBElement<BTBControlArea> value)
	{
		this.header = value;
	}

}
