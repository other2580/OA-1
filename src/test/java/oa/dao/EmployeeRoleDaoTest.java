package oa.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.EmployeeRole;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class EmployeeRoleDaoTest {

	@Autowired
	private EmployeeRoleDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的角色关系----");
		EmployeeRole er = new EmployeeRole(0, 1, 1);
		target.add(er);
		if (er.getId() > 0)
			System.out.println("添加成功!");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("-----测试删除指定的角色关系----");
		try {
			target.delete(1, 1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testAllDelete() {
		System.out.println("-----测试删除指定员工的所有角色关系----");
		try {
			target.deleteAll(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
