package GMS.concretes;

import java.util.List;

import GMS.abstracts.CampaignService;
import GMS.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void getCampaignInfo(Campaign campaign) {
		
		System.out.println("Campaign Id: " + campaign.id +
				"\nCampaign Name: " + campaign.name +
				"\nCampaign Description: " + campaign.description +
				"\nDiscpunt Rate: %" + campaign.discountRate + 
				"\nBeginning Date: " + campaign.beginnigDate + 
				"\nEnding Date: " + campaign.endingDate);
	}

	@Override
	public void getAllCampaigns(List<Campaign> campaigns) {
		System.out.println("Campaigns:");
		for (Campaign campaign : campaigns) {
			System.out.println(campaign.name);
		}
		
	}

}
