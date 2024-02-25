package GMS.concretes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import GMS.abstracts.AdminService;
import GMS.abstracts.UserCheckService;
import GMS.entities.Admin;
import GMS.entities.Campaign;
import GMS.entities.Gamer;

public class AdminManager extends UserManager implements AdminService{

	List<Campaign> campaignList = new ArrayList<Campaign>();
	public AdminManager(UserCheckService userCheckService) {
		super(userCheckService);
	}

	@Override
	public Campaign createNewCampaign(int id,String name,String description,int discountRate,LocalDate begin,LocalDate end) {
		Campaign campaign = new Campaign();
		campaign.id=id;
		campaign.name=name;
		campaign.description=description;
		campaign.discountRate=discountRate;
		campaign.beginnigDate=begin;
		campaign.endingDate=end;
		campaignList.add(campaign);
		return campaign;
	}

	@Override
	public Campaign updateCampaign(Campaign campaign,int id,String name,String description,int discountRate,
			LocalDate begin,LocalDate end, Admin admin) {

		campaign.id=id;
		campaign.name=name;
		campaign.description=description;
		campaign.discountRate=discountRate;
		campaign.beginnigDate=begin;
		campaign.endingDate=end;
		System.out.println(campaign.name + " is updated by admin: " + admin.getFirstName() + admin.getLastName());
		return campaign;
	}

	@Override
	public void deleteCampaign(Campaign campaign, Admin admin) {
		campaignList.remove(campaign);
		System.out.println(campaign.name + " is deleted by admin: " + admin.getFirstName() + admin.getLastName());
	}
	
	@Override
	public void ban(Admin admin, Gamer gamer) {

		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " is banned by admin: " 
		+ admin.getFirstName() + " " + admin.getLastName());
	}

	@Override
	public void removeBan(Admin admin, Gamer gamer) {

		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "'s ban removed by admin: " 
				+ admin.getFirstName() + " " + admin.getLastName());
	}
	
}
