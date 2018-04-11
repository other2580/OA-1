package oa.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import oa.entity.Announcement;
import oa.entity.Department;
import oa.entity.Employee;

@ContextConfiguration("classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback
public class AnnouncementDaoTest {

	@Autowired
	private AnnouncementDao target;

	@Test
	public void testAdd() {
		System.out.println("---测试添加新的公告----");
		Employee creator = new Employee(1, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1, null);
		Employee approver = new Employee(2, "nr000", "password", "name", "", 1, new Department(1, null, null, 1), 0, 1, null);
		Department department = new Department(1, "add", "description", 1);
		Announcement announcement = new Announcement(0, "title", "content", creator, new Date(), new Date(), approver,
				new Date(), department, 1);

		target.add(announcement);
		if (announcement.getId() > 0)
			System.out.println("添加成功!");
		else
			System.out.println("添加失败！");
		System.out.println("----END----");
	}

	@Test
	public void testDelete() {
		System.out.println("----测试删除公告----");
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
		System.out.println("----测试更新公告----");
		try {
			Announcement announcement = target.fetchAnnouncementById(1);
			announcement.setTitle("update");
			target.update(announcement);
			System.out.println(announcement.getTitle());
		} catch (Exception e) {
			System.out.println("修改失败！");
		}
		System.out.println("---END----");
	}

	@Test
	public void testFetchAnnouncementById() {
		System.out.println("-----测试根据公告ID获取公告----");
		Announcement announcement = target.fetchAnnouncementById(1);
		if (announcement == null)
			System.out.println("没有找到相对应的数据！");
		else
			System.out.println(announcement.getTitle() + "\t" + announcement.getDepartment().getName());
		System.out.println("----END----");
	}

	@Test
	public void testFetchAnnouncementByDepartmentId() {
		System.out.println("----测试根据部门Id查找公告信息----");
		for (Announcement a : target.fetchAnnouncementByDepartmentId(1)) {
			System.out.println(a.getTitle() + "\t" + a.getDepartment().getName());
		}
		System.out.println("----END----");
	}

}
