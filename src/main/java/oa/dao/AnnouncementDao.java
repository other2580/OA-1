package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Announcement;

@Repository
public interface AnnouncementDao {

	/**
	 * 新增公告
	 * 
	 * @param announcement
	 *            公告对象
	 */
	void add(Announcement announcement);

	/**
	 * 删除公告
	 * 
	 * @param id
	 *            公告Id
	 */
	void delete(@Param("id") int id);

	/**
	 * 修改公告
	 * 
	 * @param announcement
	 *            公告对象
	 */
	void update(Announcement announcement);

	/**
	 * 根据公告Id获取公告
	 * 
	 * @param id
	 *            公告Id
	 * @return null OR 公告对象
	 */
	Announcement fetchAnnouncementById(@Param("id") int id);

	/**
	 * 根据部门Id 查询公告
	 * 
	 * @param departmentId
	 *            部门Id
	 * @return 公告集合
	 */
	List<Announcement> fetchAnnouncementByDepartmentId(@Param("departmentId") int departmentId);
}
