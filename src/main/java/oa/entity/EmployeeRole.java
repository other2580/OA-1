package oa.entity;

/**
 * 员工角色关系
 * 
 * @author 34761
 *
 */
public class EmployeeRole {
	private int id;
	private int employeeId; // 员工Id
	private int roleId; // 角色Id

	public EmployeeRole() {
	}

	public EmployeeRole(int id, int employeeId, int roleId) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.roleId = roleId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
