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
import oa.entity.MessageReception;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class MessageReceptionDaoTest {

	@Autowired
	private MessageReceptionDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加记录----");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1, null);
		Message message = new Message(1, "title", "content", creator, new Date(), "receivers", 1, 1, 1);
		MessageReception mr = new MessageReception(0, message, creator, 1, 1);
		target.add(mr);
		if (mr.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----删除记录----");
		try {
			target.delete(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testFetchMessageReceptionById() {
		System.out.println("----测试根据 id 获取记录----");
		MessageReception mr = target.fetchMessageReceptionById(1);
		if (mr == null)
			System.out.println("没有找到记录！");
		else {
			System.out.println("邮件标题：" + mr.getMessage().getTitle());
			System.out.println("邮件接收者：" + mr.getReceiver().getName());
		}
		System.out.println("----END----");
	}

}
