package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.HabitacionesDao;
import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.dao.mapper.HabitacionesMapper;

@Component
public class ProductosImpl implements HabitacionesDao {

	private final HabitacionesMapper habitacionesMapper;
	
	public ProductosImpl(HabitacionesMapper habitacionesMapper) {
		this.habitacionesMapper = habitacionesMapper;
	}

	@Override
	public List<Habitaciones> findAll() {		
		return habitacionesMapper.findAll();
	}

}
