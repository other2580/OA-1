package oa.dao;

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

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class MessageDaoTest {

	@Autowired
	private MessageDao target;

	@Test
	public void testAdd() {
		System.out.println("---测试添加邮件---");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1, null);
		Message message = new Message(0, "title", "content", creator, new Date(), "receivers", 1, 1, 1);
		target.add(message);
		if (message.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
		System.out.println("---END---");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除邮件----");
		try {
			target.delete(1);
			System.out.println("删除邮件成功！");
		} catch (Exception e) {
			System.out.println("删除邮件失败！");
		}
		System.out.println("----END---");
	}

	@Test
	public void testFetchMessageById() {
		System.out.println("----测试根据邮件id 获取邮件信息----");
		Message message = target.fetchMessageById(1);
		System.out.println(
				message.getTitle() + "\t 创建者：" + message.getCreator().getName() + "\t接收者：" + message.getReceivers());
		System.out.println("---END---");
	}

}
