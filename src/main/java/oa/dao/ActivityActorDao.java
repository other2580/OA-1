package oa.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.ActivityActor;

@Repository
public interface ActivityActorDao {
	/**
	 * 添加新的活动与参与者关联
	 * 
	 * @param activityActor
	 *            关联对象
	 */
	void add(ActivityActor activityActor);

	/**
	 * 删除指定的活动参与者
	 * 
	 * @param activityId
	 *            活动Id
	 * @param actorId
	 *            参与者Id
	 */
	void delete(@Param("activityId") int activityId, @Param("actorId") int actorId);

	/**
	 * 删除指定活动的所有参与者
	 * 
	 * @param activityId
	 *            活动id
	 */
	void deleteAll(@Param("activityId") int activityId);

	/**
	 * 修改参与者信息 存在Bug
	 * 
	 * @param activityActor
	 *            关联对象
	 */
	void update(ActivityActor activityActor);
}
