package br.edu.atitus.paradigma.produto_service.clients;

public class CambioResponse {
	
	private Integer ID;
	private String origem;
	private String destino;
	private double fator;
	private double valorConvertido;
	private String ambiente;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getFator() {
		return fator;
	}
	public void setFator(double fator) {
		this.fator = fator;
	}
	public double getValorConvertido() {
		return valorConvertido;
	}
	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	

}
