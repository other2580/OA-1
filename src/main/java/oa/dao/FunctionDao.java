package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Function;

@Repository
public interface FunctionDao {
	/**
	 * 添加新功能
	 * 
	 * @param function
	 *            功能对象
	 */
	void add(Function function);

	/**
	 * 删除功能 （递归删除？）
	 * 
	 * @param id
	 *            功能Id
	 */
	void delete(@Param("id") int id);

	/**
	 * 更新功能信息
	 * 
	 * @param function
	 *            功能对象
	 */
	void update(Function function);

	/**
	 * 根据功能Id 查找功能对象
	 * 
	 * @param id
	 *            功能Id
	 * @return null OR Function
	 */
	Function fetchFunctionById(@Param("id") int id);

	/**
	 * 获取所有根节点
	 * 
	 * @return 功能集合
	 */
	List<Function> fetchAllFunction();
}
