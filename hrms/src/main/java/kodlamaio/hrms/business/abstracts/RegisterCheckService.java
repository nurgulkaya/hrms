package kodlamaio.hrms.business.abstracts;

public interface RegisterCheckService {
        boolean checkMail(String email);
        boolean checkNationalityId(String nationalityId);
    
}
