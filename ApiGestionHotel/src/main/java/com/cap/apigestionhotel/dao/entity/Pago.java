package com.cap.apigestionhotel.dao.entity;

import java.sql.Date;

public class Pago {
	
	private int pag_id, pag_re_id;
	private float pag_total;
	private Date pag_fecha_pago;
	
	
	public int getPag_id() {
		return pag_id;
	}
	
	public void setPag_id(int pag_id) {
		this.pag_id = pag_id;
	}
	
	public int getPag_re_id() {
		return pag_re_id;
	}
	
	public void setPag_re_id(int pag_re_id) {
		this.pag_re_id = pag_re_id;
	}
	
	public float getPag_total() {
		return pag_total;
	}
	
	public void setPag_total(float pag_total) {
		this.pag_total = pag_total;
	}
	
	public Date getPag_fecha_pago() {
		return pag_fecha_pago;
	}
	
	public void setPag_fecha_pago(Date pag_fecha_pago) {
		this.pag_fecha_pago = pag_fecha_pago;
	}

	
	
}
