package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="statoficvidacha")
public class EntityStatOficiantVidacha {
	
	private int id;
	private int statOficiantVidachaZakaz;
	private int statOficiantVidachaStolik;
	private String statOficiantVidachaBludoName;
	private int statOficiantVidachaKolichestvo;
	
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	
	@Column(name="zakaz")
	public int getStatOficiantVidachaZakaz() {
		return statOficiantVidachaZakaz;
	}
	
	@Column(name="stolik")
	public int getStatOficiantVidachaStolik() {
		return statOficiantVidachaStolik;
	}
	
	@Column(name="bludoname")
	public String getStatOficiantVidachaBludoName() {
		return statOficiantVidachaBludoName;
	}
	
	@Column(name="kolichestvo")
	public int getStatOficiantVidachaKolichestvo() {
		return statOficiantVidachaKolichestvo;
	}
	
	public void setStatOficiantVidachaZakaz(int statOficiantVidachaZakaz) {
		this.statOficiantVidachaZakaz = statOficiantVidachaZakaz;
	}

	public void setStatOficiantVidachaStolik(int statOficiantVidachaStolik) {
		this.statOficiantVidachaStolik = statOficiantVidachaStolik;
	}

	public void setStatOficiantVidachaBludoName(String statOficiantVidachaBludoName) {
		this.statOficiantVidachaBludoName = statOficiantVidachaBludoName;
	}

	public void setStatOficiantVidachaKolichestvo(int statOficiantVidachaKolichestvo) {
		this.statOficiantVidachaKolichestvo = statOficiantVidachaKolichestvo;
	}
	
	public void setId(int id) {
		this.id = id;
	}


}
