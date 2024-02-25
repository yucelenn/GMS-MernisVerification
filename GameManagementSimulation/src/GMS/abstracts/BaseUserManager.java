package GMS.abstracts;

import GMS.entities.User;

public abstract class BaseUserManager implements UserService{

	@Override
	public void createAccount(User user) throws Exception {

		System.out.println("Saved to db: " + user.getFirstName());
	}
		
}
