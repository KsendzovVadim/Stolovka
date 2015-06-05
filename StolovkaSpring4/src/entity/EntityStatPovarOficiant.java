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
@Table(name="statpovarofic")
public class EntityStatPovarOficiant {
	
	private int id;
	private int statPovarOficiantZakaz;
	private int statPovarOficiantStolik;
	private String statPovarOficiantBludoName;
	private int statPovarOficiantKolichestvo;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="zakaz")
	public int getStatPovarOficiantZakaz() {
		return statPovarOficiantZakaz;
	}
	
	@Column(name="stolik")
	public int getStatPovarOficiantStolik() {
		return statPovarOficiantStolik;
	}
	
	@Column(name="bludoname")
	public String getStatPovarOficiantBludoName() {
		return statPovarOficiantBludoName;
	}
	
	@Column(name="kolichestvo")
	public int getStatPovarOficiantKolichestvo() {
		return statPovarOficiantKolichestvo;
	}
	
	public void setStatPovarOficiantZakaz(int statPovarOficiantZakaz) {
		this.statPovarOficiantZakaz = statPovarOficiantZakaz;
	}

	public void setStatPovarOficiantStolik(int statPovarOficiantStolik) {
		this.statPovarOficiantStolik = statPovarOficiantStolik;
	}

	public void setStatPovarOficiantBludoName(String statPovarOficiantBludoName) {
		this.statPovarOficiantBludoName = statPovarOficiantBludoName;
	}

	public void setStatPovarOficiantKolichestvo(int statPovarOficiantKolichestvo) {
		this.statPovarOficiantKolichestvo = statPovarOficiantKolichestvo;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
