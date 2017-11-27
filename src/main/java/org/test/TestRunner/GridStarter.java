package org.test.TestRunner;

import org.openqa.grid.internal.utils.configuration.GridHubConfiguration;
import org.openqa.grid.web.Hub;

public class GridStarter{

	static Hub hub;
	
	public static void startHub() throws Exception{
		
		int port = 4444;
		String host = "localhost";
		
		GridHubConfiguration ghconfig = new GridHubConfiguration();
		ghconfig.port = port;
		ghconfig.host = host;
		hub = new Hub(ghconfig);
		hub.start();
	}
	
	public static void stopHub() throws Exception{
		
		hub.stop();
	}
	
}
