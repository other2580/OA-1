package oa;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import oa.entity.Function;

@Repository
public interface FunctionDao {
	void add(Function function);

	void delete(@Param("id") int id);

	void update(Function function);

	Function fetchFunctionById(@Param("id") int id);
}
