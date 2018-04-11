package oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.MessageReception;

@Repository
public interface MessageReceptionDao {
	/**
	 * 添加邮件接受记录
	 * 
	 * @param messageReception
	 *            邮件接收记录对象
	 */
	void add(MessageReception messageReception);

	/**
	 * 删除邮件接受记录
	 * 
	 * @param id
	 *            记录Id
	 */
	void delete(@Param("id") int id);

	/**
	 * 根据记录Id获取 记录
	 * 
	 * @param id
	 *            记录id
	 * @return null OR 记录对象
	 */
	MessageReception fetchMessageReceptionById(@Param("id") int id);
}
