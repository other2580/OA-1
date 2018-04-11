package oa.entity;

import java.util.Date;

/**
 * 公告
 * 
 * @author 34761
 *
 */
public class Announcement {
	private int id;
	private String title; // 公告标题
	private String content; // 公告内容
	// private int creatorId; // 创建者ID
	private Employee creator; // 创建者
	private Date createTime; // 创建时间
	private Date lastEditTime; // 最后修改时间
	// private int approverId; // 审批者Id
	private Employee approver; // 审阅者
	private Date approveTime; // 审批时间
	// private int departmentId; // 所属部门Id
	private Department department; // 所属部门
	private int status; // 公告状态（0-草拟，1-待审批，2-通过审批，3-审批驳回，4-注销）

	public Announcement() {

	}

	public Announcement(int id, String title, String content, Employee creator, Date createTime, Date lastEditTime,
			Employee approver, Date approveTime, Department department, int status) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.creator = creator;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
		this.approver = approver;
		this.approveTime = approveTime;
		this.department = department;
		this.status = status;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public Employee getApprover() {
		return approver;
	}

	public void setApprover(Employee approver) {
		this.approver = approver;
	}

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
