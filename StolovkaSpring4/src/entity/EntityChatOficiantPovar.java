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
@Table(name="chatoficpovar")
public class EntityChatOficiantPovar {
	
	private int id;
	private String chatOficiantPovarSotrudnik;
	private String chatOficiantPovarText;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	
	@Column(name="sotrudnik")
	public String getChatOficiantPovarSotrudnik() {
		return chatOficiantPovarSotrudnik;
	}
	
	@Column(name="text")
	public String getChatOficiantPovarText() {
		return chatOficiantPovarText;
	}
	
	public void setChatOficiantPovarSotrudnik(String chatOficiantPovarSotrudnik) {
		this.chatOficiantPovarSotrudnik = chatOficiantPovarSotrudnik;
	}

	public void setChatOficiantPovarText(String chatOficiantPovarText) {
		this.chatOficiantPovarText = chatOficiantPovarText;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
