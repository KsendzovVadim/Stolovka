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
@Table(name="chatadminpovar")
public class EntityChatAdminPovar {
	
	private int id;
	private String chatAdminPovarSotrudnik;
	private String chatAdminPovarText;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="sotrudnik")
	public String getChatAdminPovarSotrudnik() {
		return chatAdminPovarSotrudnik;
	}
	
	@Column(name="text")
	public String getChatAdminPovarText() {
		return chatAdminPovarText;
	}
	
	public void setChatAdminPovarSotrudnik(String chatAdminPovarSotrudnik) {
		this.chatAdminPovarSotrudnik = chatAdminPovarSotrudnik;
	}

	public void setChatAdminPovarText(String chatAdminPovarText) {
		this.chatAdminPovarText = chatAdminPovarText;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
