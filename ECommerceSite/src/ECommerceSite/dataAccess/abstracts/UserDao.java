package ECommerceSite.dataAccess.abstracts;

import java.util.List;
import ECommerceSite.entities.concrete.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List <User> getAll();
    
}
