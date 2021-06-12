package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerCheckManager implements EmployerCheckService {
	
	Employer employer;
	EmployerDao employerDao;

	@Override
	public boolean checkCompanyName(String companyName) {
		List<Employer> employerCompany = employerDao.findAll();
	      for(Employer employers : employerCompany) {
	    	  if(employers.getEmail().equals(employerCompany)) {
	    		  return false;
	        }
	      }
			return true;
		}

	@Override
	public boolean checkWebSite(String website) {
		List<Employer> employerWeb = employerDao.findAll();
	      for(Employer employers : employerWeb) {
	    	  if(employers.getEmail().equals(employerWeb)) {
	    		  return false;
	        }
	      }
			return true;
		}

	@Override
	public boolean checkMail(String mail) {
	     List<Employer> employerDMail = employerDao.findAll();
	      for(Employer employers : employerDMail) {
	    	  if(employers.getEmail().equals(employerDMail)) {
	    		  return false;
	        }
	      }
			return true;
		}
	
	@Override
	public boolean checkDomain(String website, String email) {
		String[] mail = email.split("@");
        if (!website.contains(mail[1])) {
            return false;        
        }
		return true;	
	}


	@Override
	public boolean checkPhone(String phone) {
	     List<Employer> employerPhone = employerDao.findAll();
	      for(Employer employers : employerPhone) {
	    	  if(employers.getEmail().equals(employerPhone)) {
	    		  return false;
	        }
	      }
			return true;
		}


	@Override
	public boolean checkPassword(String password) {
	     List<Employer> employerPassword = employerDao.findAll();
	      for(Employer employers : employerPassword) {
	    	  if(employers.getEmail().equals(employerPassword)) {
	    		  return false;
	        }
	      }
			return true;
		}
	}

