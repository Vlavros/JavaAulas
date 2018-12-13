package br.com.elaborata.agenda.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Agenda {
	private Integer idAgenda;
	private Date dataInicio;
	private Date dataFim;
	private Integer duracao;
	private String nomeEvento;
	private LocalDate data;
	private LocalTime horaInicio;
	
	

	public Agenda(Integer idAgenda, Date dataInicio, Date dataFim, Integer duracao, String nomeEvento, LocalDate data,
			LocalTime horaInicio) {
		super();
		this.idAgenda = idAgenda;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.duracao = duracao;
		this.nomeEvento = nomeEvento;
		this.data = data;
		this.horaInicio = horaInicio;
	}

	public Integer getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

}
