package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.HabitacionesDao;
import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.dao.mapper.HabitacionesMapper;

@Component
public class HabitacionesImpl implements HabitacionesDao {

	private final HabitacionesMapper habitacionesMapper;
	
	public HabitacionesImpl(HabitacionesMapper habitacionesMapper) {
		this.habitacionesMapper = habitacionesMapper;
	}

	@Override
	public List<Habitaciones> findAll() {		
		return habitacionesMapper.findAll();
	}

	@Override
	public Habitaciones findHabitacion(int ha_id) {
		return habitacionesMapper.findHabitacion(ha_id);
	}

	@Override
	public void insert(Habitaciones habitacion) {
		habitacionesMapper.insert(habitacion);
		
	}

	@Override
	public void update(Habitaciones habitacion) {
		habitacionesMapper.update(habitacion);
	}

	@Override
	public void delete(int ha_id) {
		habitacionesMapper.delete(ha_id);
	}

}
