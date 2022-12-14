package com.bridgelabz.bookstore.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Mail implements Serializable {

	private static final long serialVersionUID = 1L;
	private String from;
	private String to;
	private String subject;
	private String content;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Mail [from=" + from + ", to=" + to + ", subject=" + subject + ", content=" + content + "]";
	}

}
