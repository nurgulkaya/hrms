package Concrete;

import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {
	
	@Override
	public void addMember(Member member) {
          System.out.println(member.getFirstName()+ " " +member.getLastName()+ " " +
        		             member.getMail()+ " Yeni Üye Eklendi." );
	}

	@Override
	public void deleteMember(Member member) {
		System.out.println(member.getFirstName()+ " " +member.getLastName()+ " " +
	                       member.getMail()+ " " + " Üye Silindi" );
	}

	@Override
	public void updateMember(Member member) {
		System.out.println(member.getFirstName()+ " " +member.getLastName()+ " " +
	             member.getMail()+ " " +member.getDateOfBirth()+ " Üye Bilgileri Güncellendi." );	
	}


}
