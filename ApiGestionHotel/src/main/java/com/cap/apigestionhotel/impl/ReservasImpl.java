package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ReservasDAO;
import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.dao.mapper.ReservasMapper;
import com.cap.apigestionhotel.dao.mapper.ReservasMapper;

@Component
public class ReservasImpl implements ReservasDAO {


private final ReservasMapper reservasMapper;
	
	public ReservasImpl(ReservasMapper clientesMapper) {
		this.reservasMapper = clientesMapper;
	}

	@Override
	public List<Reservas> findAll() {		
		return reservasMapper.findAll();
	}

	@Override
	public Reservas findReserva(String re_id) {		
		return reservasMapper.findReserva(re_id);
	}
}
