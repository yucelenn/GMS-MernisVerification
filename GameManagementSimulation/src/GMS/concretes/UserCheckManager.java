package GMS.concretes;

import GMS.abstracts.UserCheckService;
import GMS.entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
