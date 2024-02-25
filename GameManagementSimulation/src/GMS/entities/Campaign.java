package GMS.entities;

import java.time.LocalDate;

public class Campaign {
	
	public int id;
	public String name;
	public String description;	
	public int discountRate;
	public LocalDate beginnigDate;
	public LocalDate endingDate;
	
	public Campaign() {

	}
	
	public Campaign(int id, String name, String description, int discountRate, LocalDate beginnigDate,
			LocalDate endingDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountRate = discountRate;
		this.beginnigDate = beginnigDate;
		this.endingDate = endingDate;
	}

	
	
}
