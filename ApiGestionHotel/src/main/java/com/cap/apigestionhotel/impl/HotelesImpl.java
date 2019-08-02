package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.HotelesDao;
import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.dao.mapper.HotelesMapper;

@Component
public class HotelesImpl implements HotelesDao {

	private final HotelesMapper hotelesMapper;
	
	public HotelesImpl(HotelesMapper hotelesMapper) {
		this.hotelesMapper = hotelesMapper;
	}

	@Override
	public List<Hoteles> findAll() {
		return hotelesMapper.findAll();
	}

}
