package oa.entity;

/**
 * 角色
 * 
 * @author 34761
 *
 */
public class Role {
	private int id; // update 鸿，，dfsdfdferve
	private String name; // 角色名称

	public Role() {
	}

	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
