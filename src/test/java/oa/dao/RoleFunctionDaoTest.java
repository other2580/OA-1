package oa.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.RoleFunction;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class RoleFunctionDaoTest {

	@Autowired
	private RoleFunctionDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的关联----");
		RoleFunction rf = new RoleFunction(0, 1, 10);
		target.add(rf);
		if (rf.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("----添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除指定关联----");
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
		System.out.println("----测试删除与角色相关的全部关联----");
		try {
			target.deleteAll(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("----END----");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
