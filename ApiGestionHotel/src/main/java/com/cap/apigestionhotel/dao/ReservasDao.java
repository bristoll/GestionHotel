package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Reservas;



public interface ReservasDao {
 
	public List<Reservas> findAll();
	
	public Reservas findReserva(int re_id );
	public void insert(Reservas reserva);
	public void update(Reservas reserva);
	public void delete(int re_id);
}
