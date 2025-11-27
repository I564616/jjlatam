
package com.jnj.outboundservice.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for salesOrderPricingWrapper complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="salesOrderPricingWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salesOrderPricingRequest" type="{http://itsusmpl00082.jnj.com/SG910_BtB_IN0498_SalesOrder_Global_Source_v1.webService:salesOrderWS}salesOrderPricingRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderPricingWrapper", propOrder =
{ "salesOrderPricingRequest" })
@XmlRootElement(name = "SalesOrderPricingWrapper")
public class SalesOrderPricingWrapper
{

	@XmlElement(required = true, nillable = true)
	protected SalesOrderPricingRequest salesOrderPricingRequest;

	/**
	 * Gets the value of the salesOrderPricingRequest property.
	 * 
	 * @return possible object is {@link SalesOrderPricingRequest }
	 * 
	 */
	public SalesOrderPricingRequest getSalesOrderPricingRequest()
	{
		return salesOrderPricingRequest;
	}

	/**
	 * Sets the value of the salesOrderPricingRequest property.
	 * 
	 * @param value
	 *           allowed object is {@link SalesOrderPricingRequest }
	 * 
	 */
	public void setSalesOrderPricingRequest(final SalesOrderPricingRequest value)
	{
		this.salesOrderPricingRequest = value;
	}

}
