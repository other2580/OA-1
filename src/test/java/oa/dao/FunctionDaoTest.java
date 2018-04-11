package oa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Function;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class FunctionDaoTest {

	@Autowired
	private FunctionDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加功能----");
		Function function = new Function(0, "name", "code", 0, "menuLog", "menuEntry", null, null);
		target.add(function);
		if (function.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除功能----");
		try {
			target.delete(10);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("外键约束，删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试更新功能----");
		Function function = target.fetchFunctionById(10);
		if (function == null)
			System.out.println("未找到要修改的数据！");
		else {
			function.setName("update");
			function = target.fetchFunctionById(10);
			System.out.println(function.getName());
		}
		System.out.println("---END---");
	}

	@Test
	public void testFetchFunctionById() {
		System.out.println("----测试自关联---");
		Function function = target.fetchFunctionById(60);
		System.out.println(function.getParent().getName());
		for (Function f : function.getFunctions()) {
			System.out.println("\t" + f.getName());
			for (Function x : f.getFunctions()) {
				System.out.println("\t\t" + x.getName());
			}
		}
		System.out.println("---END---");
	}

	@Test
	public void testFetchAllFunction() {
		System.out.println("----测试获取全部根节点---");
		for (Function f : target.fetchAllFunction()) {
			System.out.println(f.getParent().getName());
			for (Function c : f.getFunctions()) {
				System.out.println("\t" + c.getName());
				for (Function x : c.getFunctions()) {
					System.out.println("\t\t" + x.getName());
					for (Function i : x.getFunctions()) {
						System.out.println("\t\t\t" + i.getName());
					}
				}
			}
		}
		System.out.println("----END----");
	}

}
