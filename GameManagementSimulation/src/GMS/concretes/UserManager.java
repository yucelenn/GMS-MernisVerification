package GMS.concretes;

import java.util.ArrayList;
import java.util.List;

import GMS.abstracts.BaseUserManager;
import GMS.abstracts.UserCheckService;
import GMS.entities.User;

public class UserManager extends BaseUserManager{
	
	private UserCheckService userCheckService;
	private List<User> users = new ArrayList<User>();
	
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void createAccount(User user) throws Exception {

		if (userCheckService.checkIfRealPerson(user)) {
			System.out.println("Welcome to the game: " + user.getFirstName() + user.getLastName());
			users.add(user);
		}
		else {
			throw new Exception("Not a valid person!");
		}
		
	}

	@Override
	public void signIn(User user) {//kullanıcı giriş yapacak simülasyonu
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " is online!");
	}

	@Override
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " is offline!");
	}

	@Override
	public void getUserInfo(User user) {
		System.out.println("Id: " + user.getId() +
				"\nName: " + user.getFirstName() + " " + user.getLastName() +
				"\nEmail: " + user.geteMail() + 
				"\nPassword: " + user.getPassword() + 
				"\nNationality Id: " + user.getNationalityId() + 
				"\nDate Of Birth: " + user.getDateOfBirth() + 
				"\nMembership Date: " + user.getDateOfMembership());
		
	}

	@Override
	public void updateUserInfo(User user) {

		System.out.println("User " + user.getFirstName() + user.getLastName() + " updated.");
	}

	@Override
	public void deleteAccount(User user) {

		System.out.println("User " + user.getFirstName() + user.getLastName() + " deleted.");
		
	}

	@Override
	public void getAllUsers() {

		System.out.println("Users:");
		for (User user : users) {
			System.out.println(user.getId()+"." + user.getFirstName() + user.getLastName());
		}
	}

}
