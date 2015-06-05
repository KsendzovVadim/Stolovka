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
@Table(name="POLNOEMENY")
public class EntityPolnoeMenu {
	
	private int id;
	private String bludoName;
	private int price;
	private int zatrati;
	private int pribil;
	private String kartinka;
	
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="bludoname")
	public String getBludoName() {
		return bludoName;
	}
	
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	
	@Column(name="zatrati")
	public int getZatrati() {
		return zatrati;
	}
	
	@Column(name="pribil")
	public int getPribil() {
		return pribil;
	}
	
	@Column(name="kartinka")
	public String getKartinka() {
		return kartinka;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBludoName(String bludoName) {
		this.bludoName = bludoName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setZatrati(int zatrati) {
		this.zatrati = zatrati;
	}

	public void setPribil(int pribil) {
		this.pribil = pribil;
	}

	public void setKartinka(String kartinka) {
		this.kartinka = kartinka;
	}

}
