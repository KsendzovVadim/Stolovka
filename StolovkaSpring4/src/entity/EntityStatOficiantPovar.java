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
@Table(name="statoficpovar")
public class EntityStatOficiantPovar {
	
	private int id;
	private int statOficiantPovarZakaz;
	private int statOficiantPovarStolik;
	private String statOficiantPovarBludoName;
	private int statOficiantPovarKolichestvo;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="zakaz")
	public int getStatOficiantPovarZakaz() {
		return statOficiantPovarZakaz;
	}
	
	@Column(name="stolik")
	public int getStatOficiantPovarStolik() {
		return statOficiantPovarStolik;
	}
	
	@Column(name="bludoname")
	public String getStatOficiantPovarBludoName() {
		return statOficiantPovarBludoName;
	}
	
	@Column(name="kolichestvo")
	public int getStatOficiantPovarKolichestvo() {
		return statOficiantPovarKolichestvo;
	}
	
	public void setStatOficiantPovarZakaz(int statOficiantPovarZakaz) {
		this.statOficiantPovarZakaz = statOficiantPovarZakaz;
	}

	public void setStatOficiantPovarStolik(int statOficiantPovarStolik) {
		this.statOficiantPovarStolik = statOficiantPovarStolik;
	}

	public void setStatOficiantPovarBludoName(String statOficiantPovarBludoName) {
		this.statOficiantPovarBludoName = statOficiantPovarBludoName;
	}

	public void setStatOficiantPovarKolichestvo(int statOficiantPovarKolichestvo) {
		this.statOficiantPovarKolichestvo = statOficiantPovarKolichestvo;
	}
	
	public void setId(int id) {
		this.id = id;
	}


}
