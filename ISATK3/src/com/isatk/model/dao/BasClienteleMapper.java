package com.isatk.model.dao;

import com.isatk.model.dto.BasClientele;
import com.isatk.model.dto.BasClienteleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasClienteleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int countByExample(BasClienteleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int deleteByExample(BasClienteleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int insert(BasClientele record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int insertSelective(BasClientele record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	List<BasClientele> selectByExample(BasClienteleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	BasClientele selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByExampleSelective(@Param("record") BasClientele record,
			@Param("example") BasClienteleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByExample(@Param("record") BasClientele record,
			@Param("example") BasClienteleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByPrimaryKeySelective(BasClientele record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bas_clientele
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByPrimaryKey(BasClientele record);
}