package Entities;

import Abstract.Entity;

public class Member implements Entity {
         private int id;
         private String firstName;
         private String lastName;
         private int dateOfBirth;
         private String nationalityId;
         private String mail;
         
        public Member() {
        	
        }
         
		public Member(int id, String firstName, String lastName, int dateOfBirth, 
				String nationalityId, String mail) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.nationalityId = nationalityId;
			this.mail = mail;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getNationalityId() {
			return nationalityId;
		}

		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}
		
		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
         
}
