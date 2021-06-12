package kodlamaio.hrms.business.concretes;

import java.util.List;


import kodlamaio.hrms.business.abstracts.RegisterCheckService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employer;


public class RegisterCheckManager implements RegisterCheckService{
	
	Candidate candidate;
	CandidateDao candidateDao;
	

	@Override
	public boolean checkMail(String email) {
      List<Candidate> candidateMail = candidateDao.findAll();
      for(Candidate candidates : candidateMail) {
    	  if(candidates.getEmail().equals(candidateMail)) {
    		  return false;
        }
      }
		return true;
	}

	@Override
	public boolean checkNationalityId(String nationalityId) {
		List<Candidate> candidateNatId = candidateDao.findAll();
	      for(Candidate candidates : candidateNatId) {
	    	  if(candidates.getEmail().equals(candidateNatId)) {
	    		  System.out.println("Bu");
	    		  return false;
	        }
	      }
			return true;
		}
	

}
