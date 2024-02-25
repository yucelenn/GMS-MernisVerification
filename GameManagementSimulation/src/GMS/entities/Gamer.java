package GMS.entities;

import java.time.LocalDate;

public class Gamer extends User{
	
	public int points;

	public Gamer(int id, String firstName, String lastName, String password, String nationalityId, String eMail,
			LocalDate dateOfBirth, LocalDate dateOfMembership) {
		super(id, firstName, lastName, password, nationalityId, eMail, dateOfBirth, dateOfMembership);
	}

}
