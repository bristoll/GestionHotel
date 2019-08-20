package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.HotelesDao;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.dao.mapper.HotelesMapper;
import com.cap.apigestionhotel.dto.HotelBusquedaDto;

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
	
	@Override
	public Hoteles findHotel(int ho_id) {		
		return hotelesMapper.findHotel(ho_id);
	}

	@Override
	public void insert(Hoteles hotel) {
		hotelesMapper.insert(hotel);
		
	}

	@Override
	public void update(Hoteles hotel) {
		hotelesMapper.update(hotel);
	}

	@Override
	public void delete(int ho_id) {
		hotelesMapper.delete(ho_id);
		
	}

	@Override
	public List<HotelBusquedaDto> busquedaHotelHabitacionLibre(int numPer) {
		return hotelesMapper.busquedaHotelHabitacionLibre(numPer);
	}

}
