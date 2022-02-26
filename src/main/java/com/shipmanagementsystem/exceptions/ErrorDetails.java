package com.shipmanagementsystem.exceptions;
import java.util.Date;

/**
 * The Class ErrorDetails.
 */
public class ErrorDetails {

	/** The time stamp. */
	private Date timestamp;

	/** The message. */
	private String message;

	/** The details. */
	private String details;

	/**
	 * Instantiates a new error details.
	 */
	public ErrorDetails() {
		super();
	}

	/**
	 * Instantiates a new error details.
	 *
	 * @param timestamp the time stamp
	 * @param message   the message
	 * @param details   the details
	 */
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	/**
	 * Gets the time stamp.
	 *
	 * @return the time stamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the time stamp.
	 *
	 * @param timestamp the new time stamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the details.
	 *
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets the details.
	 *
	 * @param details the new details
	 */
	public void setDetails(String details) {
		this.details = details;
	}

}