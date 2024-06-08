package com.practice.email.dto;

import java.util.Objects;

public class MailRequest {
	
	@Override
	public int hashCode() {
		return Objects.hash(from, name, subject, to);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MailRequest other = (MailRequest) obj;
		return Objects.equals(from, other.from) && Objects.equals(name, other.name)
				&& Objects.equals(subject, other.subject) && Objects.equals(to, other.to);
	}
	private String name;
	private String to;
	private String from;
	private String subject;
	
	public MailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailRequest(String name, String to, String from, String subject) {
		super();
		this.name = name;
		this.to = to;
		this.from = from;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "MailRequest [name=" + name + ", to=" + to + ", from=" + from + ", subject=" + subject + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
