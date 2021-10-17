package br.com.residencia.enums;

public enum PessoasTipoEnum {

	CLIENTE(1, "cliente"),
	GERENTE(2, "gerente"),
	DIRETOR(3, "diretor"),
	PRESIDENTE(4, "presidente");
	
	private final Integer idTipoUsuario;
	private final String tipoUsuario;
	private PessoasTipoEnum(Integer idTipoUsuario, String tipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
		this.tipoUsuario = tipoUsuario;
	}
	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	
	
}
