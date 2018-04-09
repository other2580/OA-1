package oa.entity;

import java.util.Date;

/**
 * 内部邮件
 * 
 * @author 34761
 *
 */
public class Message {
	private int id;
	private String title; // 右键标题
	private String content; // 邮件内容
	// private int creatorId;// 创建者Id
	private Employee creator; // 创建者
	private Date sendTime; // 发送时间
	private String receivers; // 邮件接受者名称列表
	private int level; // 重要级别（1-普通，2-重要，3-紧急）
	private int status; // 状态（0-正常、2-回收站、3-彻底删除）
	private int isSent; // 是否发送（0-草稿、1-已发送）

	public Message() {

	}

	public Message(int id, String title, String content, Employee creator, Date sendTime, String receivers, int level,
			int status, int isSent) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.creator = creator;
		this.sendTime = sendTime;
		this.receivers = receivers;
		this.level = level;
		this.status = status;
		this.isSent = isSent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Employee getCreator() {
		return creator;
	}

	public void setCreator(Employee creator) {
		this.creator = creator;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getReceivers() {
		return receivers;
	}

	public void setReceivers(String receivers) {
		this.receivers = receivers;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIsSent() {
		return isSent;
	}

	public void setIsSent(int isSent) {
		this.isSent = isSent;
	}
}
