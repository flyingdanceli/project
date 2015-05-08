package com.isatk.model.dao;

import com.isatk.model.dto.BankName;
import com.isatk.model.dto.BankNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankNameMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int countByExample(BankNameExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int deleteByExample(BankNameExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int deleteByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int insert(BankName record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int insertSelective(BankName record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	List<BankName> selectByExample(BankNameExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	BankName selectByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByExampleSelective(@Param("record") BankName record,
			@Param("example") BankNameExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByExample(@Param("record") BankName record,
			@Param("example") BankNameExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByPrimaryKeySelective(BankName record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bank_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	int updateByPrimaryKey(BankName record);
}