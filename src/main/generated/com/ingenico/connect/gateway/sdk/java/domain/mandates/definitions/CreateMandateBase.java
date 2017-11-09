/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class CreateMandateBase {

	private MandateCustomer customer = null;

	private String customerReference = null;

	private String language = null;

	private String recurrenceType = null;

	private String returnUrl = null;

	private String signatureType = null;

	/**
	 * Customer object containing customer specific inputs
	 */
	public MandateCustomer getCustomer() {
		return customer;
	}

	/**
	 * Customer object containing customer specific inputs
	 */
	public void setCustomer(MandateCustomer value) {
		this.customer = value;
	}

	/**
	 * The unique identifier of a customer
	 */
	public String getCustomerReference() {
		return customerReference;
	}

	/**
	 * The unique identifier of a customer
	 */
	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	/**
	 * The language of the customer.
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * The language of the customer.
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Specifies whether the mandate is for one-off or recurring payments.
	 */
	public String getRecurrenceType() {
		return recurrenceType;
	}

	/**
	 * Specifies whether the mandate is for one-off or recurring payments.
	 */
	public void setRecurrenceType(String value) {
		this.recurrenceType = value;
	}

	/**
	 * Return url to use if the mandate signing requires redirection.
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * Return url to use if the mandate signing requires redirection.
	 */
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}

	/**
	 * Specifies whether the mandate is 'Unsigned' or singed by 'SMS'.
	 */
	public String getSignatureType() {
		return signatureType;
	}

	/**
	 * Specifies whether the mandate is 'Unsigned' or singed by 'SMS'.
	 */
	public void setSignatureType(String value) {
		this.signatureType = value;
	}
}