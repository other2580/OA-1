package oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Document;

@Repository
public interface DocumentDao {
	/**
	 * 新增文档
	 * 
	 * @param document
	 *            文档对象
	 */
	void add(Document document);

	/**
	 * 删除文档
	 * 
	 * @param id
	 *            文档Id
	 */
	void delete(@Param("id") int id);

	/**
	 * 修改文档信息
	 * 
	 * @param document
	 *            文档对象
	 */
	void update(Document document);

	/**
	 * 根据文档Id 获取文档对象
	 * 
	 * @param id
	 *            文档Id
	 * @return null OR 文档对象
	 */
	Document fetchDocumentById(@Param("id") int id);

	/**
	 * 获取所有文档根节点
	 * 
	 * @return 文档集合
	 */
	List<Document> fetchAllDocument();
}
