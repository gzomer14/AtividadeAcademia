package database.model;

public class usuario {

	private int cd_usuario;
	private String nm_usuario;
	private String ds_senha;
	
	public usuario(final int cd_usuario, final String nm_usuario, final String ds_senha) {
	
		this.cd_usuario = cd_usuario;
		this.nm_usuario = nm_usuario;
		this.setDs_senha(ds_senha);
		
	}

	public String getDs_senha() {
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}
	
	public int getCd_usuario() {
		return cd_usuario;
	}
	
	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}
	
	public String getNm_usuario() {
		return nm_usuario;
	}
public void setNm_usuario(String nm_usuario){
	this.nm_usuario = nm_usuario;
}
}
