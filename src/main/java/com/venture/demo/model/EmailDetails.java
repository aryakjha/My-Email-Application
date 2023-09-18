package com.venture.demo.model;

import lombok.Data;

@Data
public class EmailDetails {
	
	private String to;
	private String subject;
	private String msgBody;
	private String attachment;
	public EmailDetails(String to, String subject, String msgBody, String attachment) {
		super();
		this.to = to;
		this.subject = subject;
		this.msgBody = msgBody;
		this.attachment = attachment;
	}
	public EmailDetails() {
		super();
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
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	@Override
	public String toString() {
		return "EmailDetails [to=" + to + ", subject=" + subject + ", msgBody=" + msgBody + ", attachment=" + attachment
				+ "]";
	}

}
