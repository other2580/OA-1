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
import oa.entity.Document;
import oa.entity.Employee;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class DocumentDaoTest {

	@Autowired
	private DocumentDao target;

	@Test
	public void testAdd() {
		System.out.println("----测试添加新的文档----");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1);
		Document document = new Document(0, "name", "description", creator, new Date(), "type", "fileUrl", null, null);
		target.add(document);
		if (document.getId() > 0)
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除文档----");
		try {
			target.delete(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			System.err.println("删除失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testUpdate() {
		System.out.println("----测试修改文档信息----");
		Document document = target.fetchDocumentById(1);
		document.setName("update");
		try {
			target.update(document);
			document = target.fetchDocumentById(1);
			System.out.println(document.getName());
		} catch (Exception e) {
			System.out.println("修改失败！");
		}
		System.out.println("----END----");
	}

	@Test
	public void testFetchDocumentById() {
		System.out.println("----测试根据Id 获取文档节点----");
		Document document = target.fetchDocumentById(2);
		if (document == null)
			System.out.println("没有找到相对应的对象！");
		else {
			System.out.println(document.getParent().getName());
			for (Document d : document.getDocuments()) {
				System.out.println("\t" + d.getName());
			}
		}
		System.out.println("----END----");
	}

	@Test
	public void testFetchAllDocument() {
		System.out.println("----测试获取根节点----");
		for (Document d : target.fetchAllDocument()) {
			System.out.println(d.getId() + "," + d.getName());
			for (Document x : d.getDocuments()) {
				System.out.println("\t" + x.getName());
			}
		}
		System.out.println("----END----");
	}

}
