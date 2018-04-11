package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.MessageAttachment;

@Repository
public interface MessageAttachmentDao {
	/**
	 * 新增邮件附件
	 * 
	 * @param messageAttachment
	 *            附件对象
	 */
	void add(MessageAttachment messageAttachment);

	/**
	 * 根据邮件Id 删除相对应的附件
	 * @param messageId 邮件Id
	 */
	void delete(@Param("messageId") int messageId);
	
	/**
	 * 根据邮件Id 获取所属附件
	 * 
	 * @param messageId
	 *            邮件Id
	 * @return 附件集合
	 */
	List<MessageAttachment> fetchMessageAttachmentByMSID(@Param("messageId") int messageId);
}
