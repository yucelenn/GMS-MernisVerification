package GMS.entities;

import java.time.LocalDate;

public class Admin extends User{

	private boolean authorization = true;
	
	public Admin(int id, String firstName, String lastName, String password, String nationalityId, String eMail,
			LocalDate dateOfBirth, LocalDate dateOfMembership) {
		super(id, firstName, lastName, password, nationalityId, eMail, dateOfBirth, dateOfMembership);
	}

}
