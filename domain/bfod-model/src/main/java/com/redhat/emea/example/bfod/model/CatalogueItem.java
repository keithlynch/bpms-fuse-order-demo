package com.redhat.emea.example.bfod.model;

import java.util.Date;

/**
 * 
 * A representation of an item available to be added to an {@link Order}.
 * 
 */
public class CatalogueItem implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The unique ID of the item.
	 */
	private String id;
	
	private String name;
	
	private boolean selected;

	/**
	 * The product ID of the product.
	 */
	private String productId;

	/**
	 * The amount that is the one off payment required for the product in pence.
	 */
	private Integer oneOffAmount;

	/**
	 * The recurring payment required for the product in pence.
	 */
	private Integer recurringAmount;

	/**
	 * The frequency of the recurring payment amount e.g. monthly.
	 */
	private String frequency;

	/**
	 * The date the product is active and avaiable from.
	 */
	private Date activationDateTime;

	/**
	 * The date after which the product is not longer available.
	 */
	private Date expirationDateTime;

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the productId
	 */
	public String getProductId()
	{
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	/**
	 * @return the oneOffAmount
	 */
	public Integer getOneOffAmount()
	{
		return oneOffAmount;
	}

	/**
	 * @param oneOffAmount
	 *            the oneOffAmount to set
	 */
	public void setOneOffAmount(Integer oneOffAmount)
	{
		this.oneOffAmount = oneOffAmount;
	}

	/**
	 * @return the recurringAmount
	 */
	public Integer getRecurringAmount()
	{
		return recurringAmount;
	}

	/**
	 * @param recurringAmount
	 *            the recurringAmount to set
	 */
	public void setRecurringAmount(Integer recurringAmount)
	{
		this.recurringAmount = recurringAmount;
	}

	/**
	 * @return the frequency
	 */
	public String getFrequency()
	{
		return frequency;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}

	/**
	 * @return the activationDateTime
	 */
	public Date getActivationDateTime()
	{
		return activationDateTime;
	}

	/**
	 * @param activationDateTime
	 *            the activationDateTime to set
	 */
	public void setActivationDateTime(Date activationDateTime)
	{
		this.activationDateTime = activationDateTime;
	}

	/**
	 * @return the expirationDateTime
	 */
	public Date getExpirationDateTime()
	{
		return expirationDateTime;
	}

	/**
	 * @param expirationDateTime
	 *            the expirationDateTime to set
	 */
	public void setExpirationDateTime(Date expirationDateTime)
	{
		this.expirationDateTime = expirationDateTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CatalogueItem [id=");
		builder.append(id);
		builder.append(", productId=");
		builder.append(productId);
		builder.append(", oneOffAmount=");
		builder.append(oneOffAmount);
		builder.append(", recurringAmount=");
		builder.append(recurringAmount);
		builder.append(", frequency=");
		builder.append(frequency);
		builder.append(", activationDateTime=");
		builder.append(activationDateTime);
		builder.append(", expirationDateTime=");
		builder.append(expirationDateTime);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
