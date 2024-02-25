package GMS.abstracts;

import GMS.entities.Gamer;

public interface GamerService extends UserService {

	void gainPoints(Gamer gamer);

}
