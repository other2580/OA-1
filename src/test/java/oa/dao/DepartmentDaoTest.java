package oa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Department;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class DepartmentDaoTest {

	@Autowired
	private DepartmentDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的部门信息----");
		Department department = new Department(0, "add", "description", 1);
		target.add(department);
		if (department.getId() > 0)
			System.out.println("添加新部门成功！");
		else
			System.out.println("添加新部门失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除部门信息----");
		try {
			target.delete(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败，外键引用!");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试修改部门信息----");
		Department department = new Department(1, "update", "description", 1);
		try {
			target.update(department);
			Department temp = target.fetchDepartmentById(1);
			System.out.println("修改部门信息成功！" + temp.getName());			
		} catch (Exception e) {
			System.out.println("修改失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testFetchDepartmentById() {
		System.out.println("----测试根据部门ID 获取部门信息----");
		Department department = target.fetchDepartmentById(1);
		if (department == null)
			System.out.println("没有找到相对应的部门");
		else
			System.out.println("\t" + department.getName());
		System.out.println("----END----");
	}

	@Test
	public void testFetchDepartmentByName() {
		System.out.println("----测试根据部门名称获取部门信息----");
		Department department = target.fetchDepartmentByName("人事部");
		if (department == null)
			System.out.println("没有找到相对应的部门");
		else
			System.out.println("\t" + department.getName());
		System.out.println("----END----");
	}

	@Test
	public void testFetchAllDepartment() {
		System.out.println("----测试获取所有部门信息----");
		for (Department d : target.fetchAllDepartment()) {
			System.out.println("\t" + d.getName());
		}
		System.out.println("----END----");
	}

}
