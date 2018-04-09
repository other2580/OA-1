package oa.entity;

/**
 * 右键接受记录
 * 
 * @author 34761
 *
 */
public class MessageReception {
	private int id;
	// private int messageId; // 邮件主体Id
	// private int receiverId; // 邮件接受者
	private Message message; // 邮件主体
	private Employee receiver; // 邮件接收者
	private int isRead; // 是否已读
	private int status; // 状态（0-正常，1-回收站，3-彻底删除）

	public MessageReception() {

	}

	public MessageReception(int id, Message message, Employee receiver, int isRead, int status) {
		super();
		this.id = id;
		this.message = message;
		this.receiver = receiver;
		this.isRead = isRead;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Employee getReceiver() {
		return receiver;
	}

	public void setReceiver(Employee receiver) {
		this.receiver = receiver;
	}

	public int getIsRead() {
		return isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
