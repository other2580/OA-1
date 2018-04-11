package oa.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Activity;
import oa.entity.Department;
import oa.entity.Employee;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class ActivityDaoTest {

	@Autowired
	private ActivityDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的日程----");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1,
				null);
		Activity activity = new Activity(0, creator, new Date(), "title", "description", "location", new Date(),
				new Date(), null);
		target.add(activity);
		if (activity.getId() > 0)
			System.out.println("添加新日程成功！");
		else
			System.out.println("添加日程失败！");
		System.out.println("----END---");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除日程----");
		try {
			target.delete(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("外键引用，删除失败！");
		}
		System.out.println("----END---");
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试修改日程----");
		Activity activity = target.fetchActivityById(1);
		if (activity == null)
			System.out.println("没有查找到相对应的日程！");
		else {
			activity.setTitle("update");
			activity = target.fetchActivityById(1);
			System.out.println(activity.getTitle());
		}
		System.out.println("----END---");
	}

	@Test
	public void testFetchActivityById() {
		System.out.println("----测试根据日程Id 获取日程----");
		Activity activity = target.fetchActivityById(1);
		if (activity == null)
			System.out.println("没有查找到相对应的日程！");
		else {
			System.out.println(activity.getTitle());
			System.out.println("活动参与者：");
			for (Employee e : activity.getParticipant()) {
				System.out.println("\t" + e.getName());
			}
		}
		System.out.println("----END---");
	}

}
