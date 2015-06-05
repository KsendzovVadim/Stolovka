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
@Table(name="operpovarofic")
public class EntityOperPovarOficiant {
	
	private int id;
	private int operPovarOficiantZakaz;
	private int operPovarOficiantStolik;
	private String operPovarOficiantBludoName;
	private int operPovarOficiantKolichestvo;
	
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="zakaz")
	public int getOperPovarOficiantZakaz() {
		return operPovarOficiantZakaz;
	}
	
	@Column(name="stolik")
	public int getOperPovarOficiantStolik() {
		return operPovarOficiantStolik;
	}
	
	@Column(name="bludoname")
	public String getOperPovarOficiantBludoName() {
		return operPovarOficiantBludoName;
	}
	
	@Column(name="kolichestvo")
	public int getOperPovarOficiantKolichestvo() {
		return operPovarOficiantKolichestvo;
	}
	
	public void setOperPovarOficiantZakaz(int operPovarOficiantZakaz) {
		this.operPovarOficiantZakaz = operPovarOficiantZakaz;
	}

	public void setOperPovarOficiantStolik(int operPovarOficiantStolik) {
		this.operPovarOficiantStolik = operPovarOficiantStolik;
	}

	public void setOperPovarOficiantBludoName(String operPovarOficiantBludoName) {
		this.operPovarOficiantBludoName = operPovarOficiantBludoName;
	}

	public void setOperPovarOficiantKolichestvo(int operPovarOficiantKolichestvo) {
		this.operPovarOficiantKolichestvo = operPovarOficiantKolichestvo;
	}


	public void setId(int id) {
		this.id = id;
	}
	

}
