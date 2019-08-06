package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ReservasDao;
import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.dao.mapper.ReservasMapper;
import com.cap.apigestionhotel.dao.mapper.ReservasMapper;

@Component
public class ReservasImpl implements ReservasDao {


private final ReservasMapper reservasMapper;
	
	public ReservasImpl(ReservasMapper reservasMapper) {
		this.reservasMapper = reservasMapper;
	}

	@Override
	public List<Reservas> findAll() {		
		return reservasMapper.findAll();
	}

	@Override
	public Reservas findReserva(int re_id) {		
		return reservasMapper.findReserva(re_id);
	}


	@Override
	public void insert(Reservas reserva) {
		reservasMapper.insert(reserva);
		
	}

	@Override
	public void update(Reservas reserva) {
		reservasMapper.update(reserva);
	}

	@Override
	public void delete(int re_id) {
		reservasMapper.delete(re_id);
		
	}
}
