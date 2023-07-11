package p1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;

@Entity
public class Hybernet1 {
@Id
private String Name;
private int id;
private String Email;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



}
