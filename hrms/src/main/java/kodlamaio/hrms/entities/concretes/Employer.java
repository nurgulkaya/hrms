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
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor 

public class Employer extends User {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name="employer_companyName")
       private String companyName;
            		
       @Column(name="wmployer_webSite")
       private String webSite;  
            		
       @Column(name="employer_phoneNumber")
       private String phoneNumber;

  }
