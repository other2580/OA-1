package oa.entity;

import java.sql.Date;

public class Activity {
	private int id;
	private int creatorid;
	private Date createtime;
	private String title;
	private String description;
	private String location;
	private Date starttime;
	private Date endtime;
	public Activity() {}
	public Activity(int id, int creatorid, Date createtime, String title, String description, String location,
			Date starttime, Date endtime) {
		super();
		this.id = id;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.title = title;
		this.description = description;
		this.location = location;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCreatorid() {
		return creatorid;
	}
	public void setCreatorid(int creatorid) {
		this.creatorid = creatorid;
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
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
}
