package GMS.abstracts;

import java.rmi.RemoteException;

import GMS.entities.User;

public interface UserCheckService {
	
	boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException;

}
