package ECommerceSite.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerceSite.dataAccess.abstracts.UserDao;
import ECommerceSite.entities.concrete.User;

public class HibernateUserDao implements UserDao {
    private List<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);   	
		
	}

	@Override
	public void delete(User user) {
		((UserDao) this.users).delete(user);	
		
	}
	

	@Override
	public List<User> getAll() {
		return this.users;
	}



}
