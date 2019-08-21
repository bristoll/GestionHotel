package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.dto.HotelBusquedaDto;
import com.cap.apigestionhotel.dao.entity.Hoteles;

public interface HotelesDao {

	public List<Hoteles> findAll();
	
	public Hoteles findHotel(int ho_id );
	public void insert(Hoteles reserva);
	public void update(Hoteles reserva);
	public void delete(int ho_id);
	public List<HotelBusquedaDto> busquedaHotelHabitacionLibre(int numPer);
	
}
