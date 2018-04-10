package oa.dao;

import org.springframework.stereotype.Repository;

import oa.entity.Docment;

@Repository
public interface DocmentDao {
	void add(Docment docment);
}
