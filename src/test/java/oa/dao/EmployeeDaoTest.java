package oa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Department;
import oa.entity.Employee;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class EmployeeDaoTest {

	@Autowired
	private EmployeeDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新员工----");
		Employee employee = new Employee(0, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1);
		target.add(employee);
		if (employee.getId() > 0) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}
		System.out.println("---END---");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除员工----");
		try {
			target.delete(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.out.println("外键引用删除失败！");
		}
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试更新员工信息----");
		Employee employee = new Employee(1, "nr000", "password", "update", "", 1, new Department(1, null, null, 1), 0,
				1);
		try {
			target.update(employee);
			Employee temp = target.fetchEmployeeById(1);
			System.out.println(temp.getName());
		} catch (Exception e) {
			System.out.println("修改失败！");
		}
	}

	@Test
	public void testFetchEmployeeById() {
		System.out.println("----测试根据员工Id获取员工信息----");
		Employee employee = target.fetchEmployeeById(1);
		if (employee == null)
			System.out.println("没有找到相对应的对象！");
		else
			System.out.println(employee.getName());
		System.out.println("---END---");
	}

	@Test
	public void testFetchEmployeeByNr() {
		System.out.println("----测试根据员工编号获取员工信息----");
		Employee employee = target.fetchEmployeeByNr("Nr001");
		if (employee == null)
			System.out.println("没有找到相对应的对象！");
		else
			System.out.println(employee.getName());
		System.out.println("---END---");
	}

	@Test
	public void testFetchAllEmployee() {
		System.out.println("----测试获取全部员工信息----");
		for (Employee e : target.fetchAllEmployee()) {
			System.out.println("姓名：" + e.getName() + "，所属部门：" + e.getDepartment().getName());
		}
		System.out.println("----END----");
	}

}
