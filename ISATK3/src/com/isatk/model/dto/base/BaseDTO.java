package com.isatk.model.dto.base;

import com.isatk.ge.model.bean.Page;

public class BaseDTO {

	private Page page;
	
	private String orderString;

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}


	
	public String getOrderString() {
		return orderString;
	}

	public void setOrderString(String orderString) {
		this.orderString = orderString;
	}



	/**
	 * 业务模式
	 * 数据边界：
	 * 对于试卷:0 or null，单元:1，题目:2，题目内容:3
	 * ********
	 * 动作模式：
	 * 对于试卷：0 只读查询，1：创建做题数据，开启业务
	 */
	private Integer lineMode,actionModel;

	public Integer getLineMode() {
		return lineMode;
	}

	public void setLineMode(Integer lineMode) {
		this.lineMode = lineMode;
	}

	public Integer getActionModel() {
		return actionModel;
	}

	public void setActionModel(Integer actionModel) {
		this.actionModel = actionModel;
	}
	
	private Integer bizModel;

	public Integer getBizModel() {
		return bizModel;
	}

	public void setBizModel(Integer bizModel) {
		this.bizModel = bizModel;
	}
	
	public boolean hasAvailable() 
	{
		return false;
	}
		

	private Integer pc;
	
	public void setPageCount(int pageCount)
	{
		if(pageCount<=0)
		{
			pc=0;
			page=null;
		}
		else
		{
			
			if(page==null)
			{
				page=new Page();
				pc=1;
			}
			else
			{
				pc=null;
			}
			page.setLength(pageCount);
		}
		
	}
	
	public void setStartIndex(int ind)
	{
		if(pc==null)
		{
			page=new Page();
			page.setBegin(ind);
		}
		else if(pc==1)
		{
			page.setBegin(ind);
		}		
	}
}
