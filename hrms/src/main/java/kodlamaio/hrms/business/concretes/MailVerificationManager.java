package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

	@Override
	public boolean mailVerification() {
		return true;
	}

}
