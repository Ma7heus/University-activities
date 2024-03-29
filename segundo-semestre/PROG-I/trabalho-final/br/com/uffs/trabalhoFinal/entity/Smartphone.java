package br.com.uffs.trabalhoFinal.entity;

import java.io.Serializable;

import br.com.uffs.trabalhoFinal.Enums.EnumModelo;

public class Smartphone implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idSmartphone;

    private EnumModelo modelo;

    private Usuario Usuario;

    private String mac;

    private String imei;

	public Long getIdSmartphone() {
		return idSmartphone;
	}

	public void setIdSmartphone(Long idSmartphone) {
		this.idSmartphone = idSmartphone;
	}

	public EnumModelo getModelo() {
		return modelo;
	}

	public void setModelo(EnumModelo modelo) {
		this.modelo = modelo;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

}
