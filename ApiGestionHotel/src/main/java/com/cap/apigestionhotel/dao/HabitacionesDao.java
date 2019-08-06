package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Habitaciones;

public interface HabitacionesDao {

	public List<Habitaciones> findAll();
	
	public Habitaciones findHabitaciones(int ha_id);
	public void insert(Habitaciones habitacion);
	public void update(Habitaciones habitacion);
	public void delete(int ha_id);
	
}
