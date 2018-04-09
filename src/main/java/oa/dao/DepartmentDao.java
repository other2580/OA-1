package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Department;

@Repository
public interface DepartmentDao {

	/**
	 * 增加新的部门
	 * 
	 * @param department
	 *            部门对象
	 */
	void add(Department department);

	/**
	 * 删除部门
	 * 
	 * @param id
	 *            部门Id
	 */
	void delete(int id);

	/**
	 * 更新部门信息
	 * 
	 * @param department
	 *            部门对象
	 */
	void update(Department department);

	/**
	 * 根据部门Id 获取部门信息
	 * 
	 * @param id
	 *            部门Id
	 * @return 部门对象
	 */
	Department fetchDepartmentById(@Param("id") int id);

	/**
	 * 根据部门名称查找部门
	 * 
	 * @param name
	 *            部门名称
	 * @return null OR 部门对象
	 */
	Department fetchDepartmentByName(@Param("name") String name);

	/**
	 * 获取所有部门信息
	 * 
	 * @return 部门对象集合
	 */
	List<Department> fetchAllDepartment();
}
