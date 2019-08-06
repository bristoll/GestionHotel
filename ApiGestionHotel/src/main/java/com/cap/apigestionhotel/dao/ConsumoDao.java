package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Consumo;
import com.cap.apigestionhotel.dao.entity.Consumo;

public interface ConsumoDao {

	public List<Consumo> findAll();
	
	public Consumo findConsumo(int con_id);
	public void insert(Consumo consumo);
	public void update(Consumo consumo);
	public void delete(int con_id);
	
}
