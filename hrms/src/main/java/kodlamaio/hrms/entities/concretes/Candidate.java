package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@Entity
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor 
public class Candidate extends User {

	
      		@Id
      		@GeneratedValue(strategy = GenerationType.IDENTITY)
      		@Column(name="candidate_firstName")
            private String firstName;
      		
      		@Column(name="candidate_lastName")
      		private String lastName;  
      		
      		@Column(name="candidate_nationalityId")
      		private String nationalityId; 
      		
      		@Column(name="candidate_dateOfBirth")
      		private String dateOfBirth;
      		
      }

