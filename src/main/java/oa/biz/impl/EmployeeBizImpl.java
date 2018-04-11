package oa.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oa.biz.EmployeeBiz;
import oa.dao.EmployeeDao;
import oa.dao.EmployeeRoleDao;
import oa.entity.Employee;
import oa.entity.EmployeeRole;
import oa.entity.Role;

@Service
public class EmployeeBizImpl implements EmployeeBiz {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeRoleDao employeeRoleDao;

	@Override
	public void addEmployee(Employee ey) {
		employeeDao.add(ey);
		// 添加角色关联
		for (Role role : ey.getRoles()) {
			employeeRoleDao.add(new EmployeeRole(0, ey.getId(), role.getId()));
		}
	}

	@Override
	public void deleteEmployee(int id) {
		// 删除角色关联
		employeeRoleDao.deleteAll(id);
		// 删除角色
		employeeDao.delete(id);
	}

}
