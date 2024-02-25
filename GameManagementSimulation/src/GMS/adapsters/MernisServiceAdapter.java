package GMS.adapsters;

import java.rmi.RemoteException;

import GMS.abstracts.UserCheckService;
import GMS.entities.User;
import MernisServiceReferance.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException {
		
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), 
				user.getFirstName().toUpperCase(), 
				user.getLastName().toUpperCase(), 
				user.getDateOfBirth().getYear());
		 
		 if(result == true){
				System.out.println("Successfully registered!");
				return true;
				
			}else {
				System.out.println("Failed to create an account! Your information does not match with E Devlet information.");
				return false;
			}
	}

}
