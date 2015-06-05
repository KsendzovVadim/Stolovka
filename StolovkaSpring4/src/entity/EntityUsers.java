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
@Table(name="users")
public class EntityUsers {
	
	private int id;
	private String usersLogin;
	private int usersPass;
		
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public int getId() {
		return id;
	}
	
	@Column(name="login")
	public String getUsersLogin() {
		return usersLogin;
	}
	
	@Column(name="pass")
	public int getUsersPass() {
		return usersPass;
	}
	
	public void setUsersLogin(String usersLogin) {
		this.usersLogin = usersLogin;
	}
	
	public void setUsersPass(int usersPass) {
		this.usersPass = usersPass;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

}
