package GMS.concretes;

import GMS.abstracts.GamerService;
import GMS.abstracts.UserCheckService;
import GMS.entities.Gamer;

public class GamerManager extends UserManager implements GamerService {

	public GamerManager(UserCheckService userCheckService) {
		super(userCheckService);
	}

	@Override
	public void gainPoints(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "is gaining points!");
		
	}

}
