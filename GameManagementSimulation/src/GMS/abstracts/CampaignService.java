package GMS.abstracts;

import java.util.List;

import GMS.entities.Campaign;

public interface CampaignService {

	void getCampaignInfo(Campaign campaign);
	void getAllCampaigns(List<Campaign> campaigns);
	
}
