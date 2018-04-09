package oa.entity;

/**
 * 员工角色关系
 * 
 * @author 34761
 *
 */
public class EmployeeRole {
	private int id;
	// private int employeeId; // 员工Id
	// private int roleId; // 角色Id
	private Employee employee; // 员工对象
	private Role role; // 角色对象

	public EmployeeRole() {
	}

	public EmployeeRole(int id, Employee employee, Role role) {
		super();
		this.id = id;
		this.employee = employee;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
