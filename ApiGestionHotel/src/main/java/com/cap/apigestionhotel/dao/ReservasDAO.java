package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Reservas;



public interface ReservasDAO {
 
	public List<Reservas> findAll();
	
	public Reservas findReserva(String re_id );
}
