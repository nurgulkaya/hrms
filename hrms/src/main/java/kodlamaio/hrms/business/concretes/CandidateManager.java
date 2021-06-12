package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.RegisterCheckService;
import kodlamaio.hrms.core.utilities.adapters.MernisService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private MernisService mernisService;
	private RegisterCheckService registerCheckService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, MernisService mernisService, 
			RegisterCheckService registerCheckService) {
		super();
		this.candidateDao = candidateDao;
		this.mernisService = mernisService;
		this.registerCheckService = registerCheckService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>
 		(this.candidateDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		if(this.mernisService.mernisServiceCheck()) {
			return new ErrorResult("Mernis kontrolü hatalı!");
		}
		else if(this.registerCheckService.checkMail(candidate.getEmail())) {
			return new ErrorResult("Girilen mail hatalı!");
		}
		else if(this.registerCheckService.checkNationalityId(candidate.getNationalityId())) {
			return new ErrorResult("Girilen kimlik no hatalı!");
		}
		else {
			this.candidateDao.save(candidate);
		}
		return new SuccessResult("Kişi eklendi");
	}	

}
