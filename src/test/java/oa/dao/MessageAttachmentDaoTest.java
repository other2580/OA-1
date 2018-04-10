package oa.dao;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Department;
import oa.entity.Employee;
import oa.entity.Message;
import oa.entity.MessageAttachment;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class MessageAttachmentDaoTest {

	@Autowired
	private MessageAttachmentDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加附件----");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1);
		Message message = new Message(0, "title", "content", creator, new Date(), "receivers", 1, 1, 1);
		MessageAttachment ma = new MessageAttachment(0, "name", "fileUrl", message);
		target.add(ma);
		if(ma.getId() > 0)
			System.out.println("添加附件成功！");
		else
			System.out.println("添加附件失败！");
		System.out.println("----END---");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFetchMessageAttachmentByMSID() {
		System.out.println("----测试根据邮件Id 查找附件---");
		for (MessageAttachment ma : target.fetchMessageAttachmentByMSID(1)) {
			System.out.println(ma.getName());
		}
		System.out.println("----END----");
	}

}
