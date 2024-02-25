package GMS.abstracts;

import java.time.LocalDate;

import GMS.entities.Admin;
import GMS.entities.Campaign;
import GMS.entities.Gamer;

public interface AdminService extends UserService{
	
	Campaign createNewCampaign(int id,String name,String description,int discountRate,LocalDate begin,LocalDate end);
	Campaign updateCampaign(Campaign campaign,int id,String name,String description,int discountRate,LocalDate begin,LocalDate end, Admin admin);
	void deleteCampaign(Campaign campaign, Admin admin);
	void ban(Admin admin, Gamer gamer);
	void removeBan(Admin admin, Gamer gamer);
		
}
