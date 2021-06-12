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
@Table(name="staffs")
@AllArgsConstructor
@NoArgsConstructor 
public class Staff extends User {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         @Column(name="staff_firstName")
         private String firstName;
           		
         @Column(name="staff_lastName")
         private String lastName;  
  		
     }
