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
@Table(name="skvoznayastata")
public class EntitySkvoznayaStata {
	
	private int id;
	private String skvoznayaStataBludoName;
	private int skvoznayaStataPrice;
	private int skvoznayaStataZatrati;
	private int skvoznayaStataPribil;
	private int skvoznayaStataKolichestvo;
	private int skvoznayaStataObshieZatrati;
	private int skvoznayaStataObshayaPribil;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="bludoname")	
	public String getSkvoznayaStataBludoName() {
		return skvoznayaStataBludoName;
	}
	
	@Column(name="price")
	public int getSkvoznayaStataPrice() {
		return skvoznayaStataPrice;
	}
	
	@Column(name="zatrati")
	public int getSkvoznayaStataZatrati() {
		return skvoznayaStataZatrati;
	}
	
	@Column(name="pribil")
	public int getSkvoznayaStataPribil() {
		return skvoznayaStataPribil;
	}
	
	@Column(name="kolichestvo")
	public int getSkvoznayaStataKolichestvo() {
		return skvoznayaStataKolichestvo;
	}
	
	@Column(name="obshiezatrati")
	public int getSkvoznayaStataObshieZatrati() {
		return skvoznayaStataObshieZatrati;
	}
	
	@Column(name="obshayapribil")
	public int getSkvoznayaStataObshayaPribil() {
		return skvoznayaStataObshayaPribil;
	}
	
	public void setSkvoznayaStataBludoName(String skvoznayaStataBludoName) {
		this.skvoznayaStataBludoName = skvoznayaStataBludoName;
	}

	public void setSkvoznayaStataPrice(int skvoznayaStataPrice) {
		this.skvoznayaStataPrice = skvoznayaStataPrice;
	}

	public void setSkvoznayaStataZatrati(int skvoznayaStataZatrati) {
		this.skvoznayaStataZatrati = skvoznayaStataZatrati;
	}

	public void setSkvoznayaStataPribil(int skvoznayaStataPribil) {
		this.skvoznayaStataPribil = skvoznayaStataPribil;
	}

	public void setSkvoznayaStataKolichestvo(int skvoznayaStataKolichestvo) {
		this.skvoznayaStataKolichestvo = skvoznayaStataKolichestvo;
	}

	public void setSkvoznayaStataObshieZatrati(int skvoznayaStataObshieZatrati) {
		this.skvoznayaStataObshieZatrati = skvoznayaStataObshieZatrati;
	}

	public void setSkvoznayaStataObshayaPribil(int skvoznayaStataObshayaPribil) {
		this.skvoznayaStataObshayaPribil = skvoznayaStataObshayaPribil;
	}
		
	public void setId(int id) {
		this.id = id;
	}

}
