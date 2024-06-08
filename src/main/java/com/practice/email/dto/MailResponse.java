package com.practice.email.dto;

import java.util.Objects;

public class MailResponse {

	private String message;
	private boolean status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public MailResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public MailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MailResonse [message=" + message + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(message, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MailResponse other = (MailResponse) obj;
		return Objects.equals(message, other.message) && status == other.status;
	}
	
}
