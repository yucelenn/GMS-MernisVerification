package GMS.abstracts;

import GMS.entities.User;

public interface UserService {
	
	void createAccount(User user) throws Exception;
	void signIn(User user);
	void signOut(User user);
	void getUserInfo(User user);
	void updateUserInfo(User user);
	void deleteAccount(User user);	
	void getAllUsers();

}
