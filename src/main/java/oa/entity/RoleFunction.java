package oa.entity;

/**
 * 角色功能关系
 * 
 * @author 34761
 *
 */
public class RoleFunction {
	private int id;
	private int roleId; // 角色Id
	private int functionId; // 功能Id

	public RoleFunction() {
	}

	public RoleFunction(int id, int roleId, int functionId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.functionId = functionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getFunctionId() {
		return functionId;
	}

	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}
}
