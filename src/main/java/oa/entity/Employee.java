package oa.entity;

import java.util.ArrayList;
import java.util.List;

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
	private String email; // 邮箱
	private int gender; // 性别
	// private int departmentId; // 所属部门id
	private Department department; // 所属部门
	private int isManager; // 是否是部门管理员
	private int status; // 员工状态（0-注销，1-可用，2-暂停）
	private List<Role> roles = new ArrayList<>(); // 角色集合

	public Employee() {
	}

	public Employee(int id, String nr, String password, String name, String email, int gender, Department department,
			int isManager, int status, List<Role> roles) {
		super();
		this.id = id;
		this.nr = nr;
		this.password = password;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.department = department;
		this.isManager = isManager;
		this.status = status;
		this.roles = roles;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
