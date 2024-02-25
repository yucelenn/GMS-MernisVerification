package GMS.entities;

import java.time.LocalDate;

import GMS.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String nationalityId;
	private String eMail;
	private LocalDate dateOfBirth;
	private LocalDate dateOfMembership;
	
	public User(int id, String firstName, String lastName, String password, String nationalityId, 
			String eMail, LocalDate dateOfBirth, LocalDate dateOfMembership) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.nationalityId = nationalityId;
		this.eMail = eMail;
		this.dateOfBirth = dateOfBirth;
		this.dateOfMembership = dateOfMembership;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfMembership() {
		return dateOfMembership;
	}

	public void setDateOfMembership(LocalDate dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}

	
}
