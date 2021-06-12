package kodlamaio.hrms.business.abstracts;

public interface EmployerCheckService {
    boolean checkCompanyName(String companyName);
    boolean checkWebSite(String website);
    boolean checkMail(String email);
    boolean checkDomain(String website, String email);
    boolean checkPhone(String phone);
    boolean checkPassword(String password);

}
