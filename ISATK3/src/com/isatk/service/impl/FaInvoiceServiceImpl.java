package com.isatk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isatk.core.exception.SysException;
import com.isatk.ge.model.bean.PageBean;
import com.isatk.model.dao.FaInvoiceMapper;
import com.isatk.model.dto.FaInvoice;
import com.isatk.model.dto.FaInvoiceExample;
import com.isatk.service.base.FaInvoiceService;
@Component
public class FaInvoiceServiceImpl implements FaInvoiceService {
	@Autowired
	private FaInvoiceMapper faInvoiceMapper;
	@Override
	public FaInvoice findOneRecord(String dbid) throws SysException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FaInvoice findOneRecord(Long dbid) throws SysException {
		return faInvoiceMapper.selectByPrimaryKey(dbid);
	}

	@Override
	public FaInvoice findOneRecord(FaInvoice dto) throws SysException {
		return findOneRecord(dto.getId());
	}

	@Override
	public PageBean<FaInvoice, FaInvoice> findListData(
			PageBean<FaInvoice, FaInvoice> page) throws SysException {
		FaInvoice dto=page.getParameterEntity();
		page.putLastRowNum(faInvoiceMapper.countByCondiction(dto));
		List<FaInvoice> list=faInvoiceMapper.selectListByCondiction(dto);
		page.setDataList(list);
		return page;
	}

	@Override
	public void deleteOneRecord(FaInvoice dto) throws SysException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOneRecord(String dbid) throws SysException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOneRecord(Long dbid) throws SysException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOneRecord(FaInvoice dto) throws SysException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOneRecord(FaInvoice dto) throws SysException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long findMaxID() throws SysException {
		// TODO Auto-generated method stub
		FaInvoiceExample example = new FaInvoiceExample();
		return null;
	}

}
