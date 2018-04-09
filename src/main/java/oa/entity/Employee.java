package oa.entity;

/**
 * 员工类
 * 
 * @author 34761
 *
 */
public class Employee {
	private int id;
	private String nr; // 员工编号
	private String password; // 员工登录密码
	private String name; // 姓名
	private int gender; // 性别
	// private int departmentId; // 所属部门id
	private Department department; // 所属部门
	private int isManager; // 是否是部门管理员
	private int status; // 员工状态（0-注销，1-可用，2-暂停）

	public Employee() {
	}

	public Employee(int id, String nr, String password, String name, int gender, Department department, int isManager,
			int status) {
		super();
		this.id = id;
		this.nr = nr;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.isManager = isManager;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
