package kodlamaio.hrms.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private EmployerCheckService employerCheckService;
	private EmployerCheckManager employerCheckManager;

	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
 		(this.employerDao.findAll(), "Data Listelendi");

	}

	@Override
	public Result add(Employer employer) {
	
	    if(this.employerCheckService.checkCompanyName(employer.getCompanyName())) {
			return new ErrorResult("Girilen şirket adı hatalı!");
		}
	    else if(this.employerCheckService.checkWebSite(employer.getWebSite())) {
		    return new ErrorResult("Girilen website adı hatalı!");
        }
	    else if(this.employerCheckService.checkMail(employer.getEmail())) {
			return new ErrorResult("Girilen mail hatalı!");
	    }
	    else if(this.employerCheckManager.checkDomain(employer.getEmail(), employer.getWebSite())){
			return new ErrorResult("Girilen mail ve website domaini hatalı!");
	    }
	    else if(this.employerCheckService.checkPhone(employer.getPhoneNumber())) {
			return new ErrorResult("Girilen telefon numarası hatalı!");
	    }
	    else if(this.employerCheckService.checkPassword(employer.getPassword())) {
			return new ErrorResult("Girilen şifre hatalı!");
	    }
	    else {
			this.employerDao.save(employer);
		}
		return new SuccessResult("Kişi eklendi");
	}
}

