package org.test.TestRunner;

import java.util.Scanner;

public class Starter extends Thread {
	
	public void sendmsg(String _str){
		System.out.print(_str);
	}
	
	
	@Override
	public void run(){
		
		Thread t_1 = null;
		
		try{
			sendmsg("Selenium Hub");
			sendmsg("------------------------------------------\n");
			Scanner sc = new Scanner(System.in);
			
			while(true){
				
				String cmd = sc.next();
				
				switch(cmd.trim()){
				
				case "start" : 
					GridStarter.startHub();
					break;
					
				case "stop" :
					GridStarter.stopHub();
					break;
					
				default : 
					System.exit(0);
					break;
				}

			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			System.exit(0);  
		}
		
	}

	
}
