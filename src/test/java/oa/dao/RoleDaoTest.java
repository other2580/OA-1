package oa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Function;
import oa.entity.Role;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class RoleDaoTest {

	@Autowired
	private RoleDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的角色信息----");
		Role role = new Role(0, "add", null);
		target.add(role);
		if (role.getId() > 0)
			System.out.println("添加新角色成功!");
		else
			System.out.println("添加新角色失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除角色----");
		try {
			target.delete(1);
			System.out.println("删除角色成功！");
		} catch (Exception e) {
			System.out.println("删除失败，外键引用！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试更改角色信息----");
		Role role = target.fetchRoleById(1);
		try {
			target.update(role);
			System.out.println(role.getName());
		} catch (Exception e) {
			System.out.println("修改失败！");
		}
		System.out.println("---END---");
	}

	@Test
	public void testFetchRoleById() {
		System.out.println("----测试根据Id 获取角色信息----");
		Role role = target.fetchRoleById(1);
		if (role == null)
			System.out.println("获取失败，没有找到相对应的角色！");
		else
			System.out.println(role.getName());
		System.out.println("---END---");
	}

	@Test
	public void testFetchRoleByName() {
		System.out.println("----测试根据角色名 获取角色信息----");
		Role role = target.fetchRoleByName("Admin");
		if (role == null)
			System.out.println("获取失败，没有找到相对应的角色！");
		else {
			System.out.println(role.getName());
		}
		System.out.println("---END---");
	}

	@Test
	public void testFetchAllRole() {
		System.out.println("----测试查询全部角色信息----");
		for (Role r : target.fetchAllRole()) {
			System.out.println(r.getName());
			System.out.println("功能：");
			for (Function f : r.getFunctions()) {
				System.out.println("\t" + f.getName());
			}
		}
		System.out.println("----END----");
	}

}
