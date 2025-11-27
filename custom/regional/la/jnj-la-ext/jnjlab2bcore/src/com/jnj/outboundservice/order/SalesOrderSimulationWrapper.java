
package com.jnj.outboundservice.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for salesOrderSimulationWrapper complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="salesOrderSimulationWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salesOrderSimulationRequest" type="{http://itsusmpl00082.jnj.com/SG910_BtB_IN0498_SalesOrder_Global_Source_v1.webService:salesOrderWS}salesOrderSimulationRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderSimulationWrapper", propOrder =
{ "salesOrderSimulationRequest" })
@XmlRootElement(name = "SalesOrderSimulationWrapper")
public class SalesOrderSimulationWrapper
{

	@XmlElement(required = true, nillable = true)
	protected SalesOrderSimulationRequest salesOrderSimulationRequest;

	/**
	 * Gets the value of the salesOrderSimulationRequest property.
	 * 
	 * @return possible object is {@link SalesOrderSimulationRequest }
	 * 
	 */
	public SalesOrderSimulationRequest getSalesOrderSimulationRequest()
	{
		return salesOrderSimulationRequest;
	}

	/**
	 * Sets the value of the salesOrderSimulationRequest property.
	 * 
	 * @param value
	 *           allowed object is {@link SalesOrderSimulationRequest }
	 * 
	 */
	public void setSalesOrderSimulationRequest(final SalesOrderSimulationRequest value)
	{
		this.salesOrderSimulationRequest = value;
	}

}
