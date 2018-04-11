package oa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 活动日程
 * 
 * @author 34761
 *
 */
public class Activity {
	private int id;
	// private int creatorid; // 创建者Id
	private Employee creator; // 创建者
	private Date createtime; // 创建时间
	private String title; // 活动名称
	private String description; // 描述
	private String location; // 地点
	private Date startTime; // 开始时间
	private Date endTime; // 结束时间
	private List<Employee> participant = new ArrayList<>(); // 活动参与者

	public Activity() {
	}

	public Activity(int id, Employee creator, Date createtime, String title, String description, String location,
			Date startTime, Date endTime, List<Employee> participant) {
		super();
		this.id = id;
		this.creator = creator;
		this.createtime = createtime;
		this.title = title;
		this.description = description;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.participant = participant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getCreator() {
		return creator;
	}

	public void setCreator(Employee creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<Employee> getParticipant() {
		return participant;
	}

	public void setParticipant(List<Employee> participant) {
		this.participant = participant;
	}
}
