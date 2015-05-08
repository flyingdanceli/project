package com.isatk.model.dto;

import java.util.Date;
import java.io.Serializable;

public class SysUser implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.fa_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Long faRange;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.so_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Long soRange;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.login_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private String loginName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.pwd
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private String pwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.ins_time
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Date insTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user.is_disable
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Integer isDisable;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.id
	 * @return  the value of sys_user.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.id
	 * @param id  the value for sys_user.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.name
	 * @return  the value of sys_user.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.name
	 * @param name  the value for sys_user.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.fa_range
	 * @return  the value of sys_user.fa_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Long getFaRange() {
		return faRange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.fa_range
	 * @param faRange  the value for sys_user.fa_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setFaRange(Long faRange) {
		this.faRange = faRange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.so_range
	 * @return  the value of sys_user.so_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Long getSoRange() {
		return soRange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.so_range
	 * @param soRange  the value for sys_user.so_range
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setSoRange(Long soRange) {
		this.soRange = soRange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.login_name
	 * @return  the value of sys_user.login_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.login_name
	 * @param loginName  the value for sys_user.login_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName == null ? null : loginName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.pwd
	 * @return  the value of sys_user.pwd
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.pwd
	 * @param pwd  the value for sys_user.pwd
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.ins_time
	 * @return  the value of sys_user.ins_time
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Date getInsTime() {
		return insTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.ins_time
	 * @param insTime  the value for sys_user.ins_time
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setInsTime(Date insTime) {
		this.insTime = insTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user.is_disable
	 * @return  the value of sys_user.is_disable
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Integer getIsDisable() {
		return isDisable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user.is_disable
	 * @param isDisable  the value for sys_user.is_disable
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setIsDisable(Integer isDisable) {
		this.isDisable = isDisable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		SysUser other = (SysUser) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getName() == null ? other.getName() == null : this
						.getName().equals(other.getName()))
				&& (this.getFaRange() == null ? other.getFaRange() == null
						: this.getFaRange().equals(other.getFaRange()))
				&& (this.getSoRange() == null ? other.getSoRange() == null
						: this.getSoRange().equals(other.getSoRange()))
				&& (this.getLoginName() == null ? other.getLoginName() == null
						: this.getLoginName().equals(other.getLoginName()))
				&& (this.getPwd() == null ? other.getPwd() == null : this
						.getPwd().equals(other.getPwd()))
				&& (this.getInsTime() == null ? other.getInsTime() == null
						: this.getInsTime().equals(other.getInsTime()))
				&& (this.getIsDisable() == null ? other.getIsDisable() == null
						: this.getIsDisable().equals(other.getIsDisable()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result
				+ ((getFaRange() == null) ? 0 : getFaRange().hashCode());
		result = prime * result
				+ ((getSoRange() == null) ? 0 : getSoRange().hashCode());
		result = prime * result
				+ ((getLoginName() == null) ? 0 : getLoginName().hashCode());
		result = prime * result
				+ ((getPwd() == null) ? 0 : getPwd().hashCode());
		result = prime * result
				+ ((getInsTime() == null) ? 0 : getInsTime().hashCode());
		result = prime * result
				+ ((getIsDisable() == null) ? 0 : getIsDisable().hashCode());
		return result;
	}

	
}
