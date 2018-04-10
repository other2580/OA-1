package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Document;

@Repository
public interface DocumentDao {
	void add(Document docment);

	void delete(@Param("id") int id);

	void update(Document docment);

	Document fetchDocumentById(@Param("id") int id);

	List<Document> fetchAllDocument();
}
