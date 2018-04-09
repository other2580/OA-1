package oa.entity;

/**
 * 邮件附件
 * 
 * @author 34761
 *
 */
public class MessageAttachment {
	private int id;
	private String name; // 附件名称
	private String fileUrl; // 附件路径
	// private int messageId; // 所属邮件 ID
	private Message message; // 所属邮件

	public MessageAttachment() {
	}

	public MessageAttachment(int id, String name, String fileUrl, Message message) {
		super();
		this.id = id;
		this.name = name;
		this.fileUrl = fileUrl;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
