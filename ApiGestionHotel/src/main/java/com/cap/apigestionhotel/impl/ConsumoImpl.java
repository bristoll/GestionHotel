package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ConsumoDao;
import com.cap.apigestionhotel.dao.entity.Consumo;
import com.cap.apigestionhotel.dao.mapper.ConsumoMapper;

@Component
public class ConsumoImpl implements ConsumoDao {

	private final ConsumoMapper consumoMapper;

	public ConsumoMapper getConsumoMapper() {
		return consumoMapper;
	}

	public ConsumoImpl(ConsumoMapper consumoMapper) {
		super();
		this.consumoMapper = consumoMapper;
	}

	@Override
	public List<Consumo> findAll() {
		return consumoMapper.findAll();
	}
	
	
	
}
