package oa.entity;

import java.util.List;

/**
 * 活动参与者
 * 
 * @author 34761
 *
 */
public class ActivityActor {
	private int id;
	// private int activityId; // 活动Id
	// private int actorId; // 参与者Id
	private Activity activity; // 活动对象
	private List<Employee> actor; // 参与者

	public ActivityActor(int id, Activity activity, List<Employee> actor) {
		super();
		this.id = id;
		this.activity = activity;
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public List<Employee> getActor() {
		return actor;
	}

	public void setActor(List<Employee> actor) {
		this.actor = actor;
	}
}
