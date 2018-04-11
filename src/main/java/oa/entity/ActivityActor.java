package oa.entity;

/**
 * 活动参与者
 * 
 * @author 34761
 *
 */
public class ActivityActor {
	private int id;
	private int activityId; // 活动Id
	private int actorId; // 参与者Id
	public ActivityActor(int id, int activityId, int actorId) {
		super();
		this.id = id;
		this.activityId = activityId;
		this.actorId = actorId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
}
