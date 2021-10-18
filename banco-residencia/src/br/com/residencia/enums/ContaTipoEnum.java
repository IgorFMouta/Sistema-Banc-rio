package br.com.residencia.enums;

import java.util.Date;

public enum ContaTipoEnum {

	CONTA_CORRENTE(1, "corrente"),
	CONTA_POUPANCA(2, "poupanca");
	
	private final Integer idTipoConta;
	private final String tipoConta;
	
	private ContaTipoEnum(Integer idTipoConta, String tipoConta) {
		this.idTipoConta = idTipoConta;
		this.tipoConta = tipoConta;
	}

	public Integer getIdTipoConta() {
		return idTipoConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}
	
	
}
