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
		this.consumoMapper = consumoMapper;
	}

	@Override
	public List<Consumo> findAll() {
		return consumoMapper.findAll();
	}

	@Override
	public Consumo findConsumo(int con_id) {
		return consumoMapper.findConsumo(con_id);
	}

	@Override
	public void insert(Consumo consumo) {
		consumoMapper.insert(consumo);
		
	}

	@Override
	public void update(Consumo consumo) {
		consumoMapper.update(consumo);		
	}

	@Override
	public void delete(int con_id) {
		consumoMapper.delete(con_id);		
	}
	
	
	
}
