package ECommerceSite.core.adapters;

import ECommerceSite.core.abstracts.GoogleService;
import ECommerceSite.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerGoogle(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register(message);
	}



}
