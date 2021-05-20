package ECommerceSite.core.abstracts;

import ECommerceSite.entities.concrete.User;

public interface ValidationService {
    void validationClick(User user);
    void validationMail(User user);
      
}
