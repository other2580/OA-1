package oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Message;

@Repository
public interface MessageDao {
	/**
	 * 添加新邮件
	 * 
	 * @param message
	 *            邮件对象
	 */
	void add(Message message);

	/**
	 * 删除邮件
	 * 
	 * @param id
	 *            邮件Id
	 */
	void delete(@Param("id") int id);

	/**
	 * 根据邮件Id 查询邮件
	 * 
	 * @param id
	 *            邮件Id
	 * @return null OR 邮件对象
	 */
	Message fetchMessageById(@Param("id") int id);
}
