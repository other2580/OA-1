package oa.entity;

import java.util.Date;
import java.util.List;

/**
 * 共享文件
 * 
 * @author 34761
 *
 */
public class Document {
	private int id;
	private String name; // 文件名称
	private String description; // 文件描述
	// private int creatorId; // 创建者ID
	private Employee creator; // 创建者
	private Date createTime; // 创建时间
	private String type; // 类型（'FOLDER'-文件夹，'docx'...-文件）
	private String fileUrl; // 文件保存路径
	// private int parentId; // 父级id
	private Document parent; // 父级对象
	private List<Document> documents; // 文件集合

	public Document() {
	}

	public Document(int id, String name, String description, Employee creator, Date createTime, String type,
			String fileUrl, Document parent, List<Document> documents) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.creator = creator;
		this.createTime = createTime;
		this.type = type;
		this.fileUrl = fileUrl;
		this.parent = parent;
		this.documents = documents;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getCreator() {
		return creator;
	}

	public void setCreator(Employee creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Document getParent() {
		return parent;
	}

	public void setParent(Document parent) {
		this.parent = parent;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
}
