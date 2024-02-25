package GMS;

import java.time.LocalDate;

import GMS.adapsters.MernisServiceAdapter;
import GMS.concretes.AdminManager;
import GMS.concretes.CampaignManager;
import GMS.concretes.UserCheckManager;
import GMS.entities.Admin;
import GMS.entities.Campaign;

public class Main {

	public static void main(String[] args) throws Exception {


		AdminManager adminManager = new AdminManager(new MernisServiceAdapter());
		Admin admin = new Admin(1,"Yücelen", "Üstün", "yuyuyuyu", "11111001111",
				"yucelenn@hotmail.com", LocalDate.of(1991, 11, 29), LocalDate.of(2024, 2, 25));
		adminManager.createAccount(admin);
		//UserCheckManager userCheckManager = new UserCheckManager();

		
		
		/*adminManager.signIn(admin);
		Campaign campaign = adminManager.createNewCampaign(1, "ilk kampanya", "yarı yarıya", 50, LocalDate.of(2024,2,5), LocalDate.of(2024,2,10));
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.getCampaignInfo(campaign);

		System.out.println("-----------------------------------------------");
		adminManager.updateCampaign(campaign, 1, "Birinci Kampanya", "yarı fiyatına", 50, LocalDate.of(2024,2,5), LocalDate.of(2024,2,10), admin);
		campaignManager.getCampaignInfo(campaign);
		System.out.println("-----------------------------------------------");*/
		
	}
	
	

}
