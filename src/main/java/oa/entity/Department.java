package oa.entity;

/**
 * 部门类
 * 
 * @author 34761
 *
 */
public class Department {
	private int id;
	private String name; // 部门名称
	private String description; // 部门描述
	private int status; // 部门状态（0-注销，1-可用）

	public Department() {
	}

	public Department(int id, String name, String description, int status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
