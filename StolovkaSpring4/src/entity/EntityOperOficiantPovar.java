package entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="operoficpovar")
public class EntityOperOficiantPovar {
	
	private int id;
	private int operOficiantPovarZakaz;
	private int operOficiantPovarStolik;
	private String operOficiantPovarBludoName;
	private int operOficiantPovarKolichestvo;
	
	
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	
	@Column(name="zakaz")
	public int getOperOficiantPovarZakaz() {
		return operOficiantPovarZakaz;
	}
	
	@Column(name="stolik")
	public int getOperOficiantPovarStolik() {
		return operOficiantPovarStolik;
	}
	
	@Column(name="bludoname")
	public String getOperOficiantPovarBludoName() {
		return operOficiantPovarBludoName;
	}
	
	@Column(name="kolichestvo")
	public int getOperOficiantPovarKolichestvo() {
		return operOficiantPovarKolichestvo;
	}
	
	public void setOperOficiantPovarZakaz(int operOficiantPovarZakaz) {
		this.operOficiantPovarZakaz = operOficiantPovarZakaz;
	}

	public void setOperOficiantPovarStolik(int operOficiantPovarStolik) {
		this.operOficiantPovarStolik = operOficiantPovarStolik;
	}

	public void setOperOficiantPovarBludoName(String operOficiantPovarBludoName) {
		this.operOficiantPovarBludoName = operOficiantPovarBludoName;
	}

	public void setOperOficiantPovarKolichestvo(int operOficiantPovarKolichestvo) {
		this.operOficiantPovarKolichestvo = operOficiantPovarKolichestvo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

}
