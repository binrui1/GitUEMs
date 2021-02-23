package coche;

public class Coche {
	private String id;
	private String matricula;
	private String modelo;
	private String marca;
	private String tipoMotor;
	private String km;
	
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Coche(String id, String matricula, String modelo, String marca, String tipoMotor, String km) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.tipoMotor = tipoMotor;
		this.km = km;
	}
	
}
