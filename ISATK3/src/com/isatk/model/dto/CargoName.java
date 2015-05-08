package com.isatk.model.dto;

import java.io.Serializable;

public class CargoName implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cargo_name.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cargo_name.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cargo_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cargo_name.id
	 * @return  the value of cargo_name.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cargo_name.id
	 * @param id  the value for cargo_name.id
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cargo_name.name
	 * @return  the value of cargo_name.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cargo_name.name
	 * @param name  the value for cargo_name.name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cargo_name
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
		CargoName other = (CargoName) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getName() == null ? other.getName() == null : this
						.getName().equals(other.getName()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cargo_name
	 * @mbggenerated  Tue May 05 20:07:07 CST 2015
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}
}