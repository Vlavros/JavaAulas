package br.com.elaborata.atendimentotecnico.model;

public class AtendimentoTecnicoModel {

	private String cliente, dataAtendimento, marcaEquipamento, processador, memoriaRam, discoRigido;
	private int qtdeUsb;
	private boolean cartaoXD, cartaoSD, cartaoMicroSD;

	public AtendimentoTecnicoModel() {

	}

	public AtendimentoTecnicoModel(String cliente, String dataAtendimento, String marcaEquipamento, String processador,
			String memoriaRam, String discoRigido, int qtdeUsb, boolean cartaoXD, boolean cartaoSD,
			boolean cartaoMicroSD) {
		super();
		this.cliente = cliente;
		this.dataAtendimento = dataAtendimento;
		this.marcaEquipamento = marcaEquipamento;
		this.processador = processador;
		this.memoriaRam = memoriaRam;
		this.discoRigido = discoRigido;
		this.qtdeUsb = qtdeUsb;
		this.cartaoXD = cartaoXD;
		this.cartaoSD = cartaoSD;
		this.cartaoMicroSD = cartaoMicroSD;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(String dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public String getMarcaEquipamento() {
		return marcaEquipamento;
	}

	public void setMarcaEquipamento(String marcaEquipamento) {
		this.marcaEquipamento = marcaEquipamento;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getDiscoRigido() {
		return discoRigido;
	}

	public void setDiscoRigido(String discoRigido) {
		this.discoRigido = discoRigido;
	}

	public int getQtdeUsb() {
		return qtdeUsb;
	}

	public void setQtdeUsb(int qtdeUsb) {
		this.qtdeUsb = qtdeUsb;
	}

	public boolean isCartaoXD() {
		return cartaoXD;
	}

	public void setCartaoXD(boolean cartaoXD) {
		this.cartaoXD = cartaoXD;
	}

	public boolean isCartaoSD() {
		return cartaoSD;
	}

	public void setCartaoSD(boolean cartãoSD) {
		this.cartaoSD = cartãoSD;
	}

	public boolean isCartaoMicroSD() {
		return cartaoMicroSD;
	}

	public void setCartaoMicroSD(boolean cartaoMicroSD) {
		this.cartaoMicroSD = cartaoMicroSD;
	}

}
