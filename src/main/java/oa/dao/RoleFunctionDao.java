package oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.RoleFunction;

@Repository
public interface RoleFunctionDao {

	/**
	 * 添加新的角色功能关联
	 * 
	 * @param rf
	 *            关联对象
	 */
	void add(RoleFunction rf);

	/**
	 * 删除指定的关联
	 * 
	 * @param roleId
	 *            角色Id
	 * @param functionId
	 *            功能Id
	 */
	void delete(@Param("roleId") int roleId, @Param("functionId") int functionId);

	/**
	 * 删除角色相关的所有关联
	 * 
	 * @param roleId
	 *            角色Id
	 */
	void deleteAll(@Param("roleId") int roleId);

	/**
	 * 修改角色与功能关联
	 *  存在 Bug
	 * @param rf
	 *            关联对象
	 */
	void update(RoleFunction rf);
}
