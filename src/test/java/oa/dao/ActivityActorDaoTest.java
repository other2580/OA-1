package oa.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.ActivityActor;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class ActivityActorDaoTest {

	@Autowired
	private ActivityActorDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的活动参与者----");
		ActivityActor activityActor = new ActivityActor(0, 1, 1);
		target.add(activityActor);
		if (activityActor.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除指定的活动参与者----");
		try {
			target.delete(1, 1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testDeleteAll() {
		System.out.println("----测试删除活动的全部参加者----");
		try {
			target.deleteAll(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.out.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
