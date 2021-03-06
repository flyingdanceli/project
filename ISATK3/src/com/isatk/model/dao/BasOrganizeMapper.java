package com.isatk.model.dao;

import com.isatk.model.dto.BasOrganize;
import com.isatk.model.dto.BasOrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrganizeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int countByExample(BasOrganizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int deleteByExample(BasOrganizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int deleteByPrimaryKey(Long orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int insert(BasOrganize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int insertSelective(BasOrganize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    List<BasOrganize> selectByExample(BasOrganizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    BasOrganize selectByPrimaryKey(Long orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int updateByExampleSelective(@Param("record") BasOrganize record, @Param("example") BasOrganizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int updateByExample(@Param("record") BasOrganize record, @Param("example") BasOrganizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int updateByPrimaryKeySelective(BasOrganize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_organize
     *
     * @mbggenerated Fri Apr 10 16:36:02 CST 2015
     */
    int updateByPrimaryKey(BasOrganize record);
}