package br.com.residencia.enums;

public enum ContaTipoEnum {

	CONTA_CORRENTE("corrente", 1),
	CONTA_POUPANCA("poupanca", 2);
	
	private final Integer idTipoConta;
	private final String tipoConta;
	
	private ContaTipoEnum(String tipoConta, Integer idTipoConta) {
		this.tipoConta = tipoConta;
		this.idTipoConta = idTipoConta;
	}

	public Integer getIdTipoConta() {
		return idTipoConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}
	
	
}
