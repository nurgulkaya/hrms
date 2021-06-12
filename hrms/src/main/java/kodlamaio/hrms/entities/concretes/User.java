package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@Entity 
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
		
		@Id
		@GeneratedValue
		@Column(name="user_id")
	    private int id;
		
		@Column(name="user_email")
	    private String email;
	
		@Column(name="user_password")
        private String password;
		
}