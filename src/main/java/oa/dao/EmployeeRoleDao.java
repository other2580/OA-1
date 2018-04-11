package oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.EmployeeRole;

@Repository
public interface EmployeeRoleDao {
	/**
	 * 新增员工角色关系
	 * 
	 * @param er
	 *            关系对象
	 */
	void add(EmployeeRole er);

	/**
	 * 删除指定的角色关系
	 * 
	 * @param employeeId
	 *            员工Id
	 * @param roleId
	 *            角色Id
	 */
	void delete(@Param("employeeId") int employeeId, @Param("roleId") int roleId);

	/**
	 * 删除员工的全部角色关系
	 * 
	 * @param employeeId
	 *            员工Id
	 */
	void deleteAll(@Param("employeeId") int employeeId);

	/**
	 * 修改员工角色关系
	 *  存在Bug
	 * @param er
	 *            关系对象
	 */
	void update(EmployeeRole er);
}
