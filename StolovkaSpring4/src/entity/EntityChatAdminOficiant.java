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
@Table(name="chatadminofic")
public class EntityChatAdminOficiant {
	
	private int id;
	private String chatAdminOficiantSotrudnik;
	private String chatAdminOficiantText;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	
	@Column(name="sotrudnik")
	public String getChatAdminOficiantSotrudnik() {
		return chatAdminOficiantSotrudnik;
	}
	
	@Column(name="text")
	public String getChatAdminOficiantText() {
		return chatAdminOficiantText;
	}
	
	public void setChatAdminOficiantSotrudnik(String chatAdminOficiantSotrudnik) {
		this.chatAdminOficiantSotrudnik = chatAdminOficiantSotrudnik;
	}
	
	public void setChatAdminOficiantText(String chatAdminOficiantText) {
		this.chatAdminOficiantText = chatAdminOficiantText;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

}
