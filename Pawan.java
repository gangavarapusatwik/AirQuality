package org.tempuri.client;

import org.tempuri.IPrakrutiService;
import org.tempuri.PrakrutiServiceLocator;

public class Pawan {
		
		public static void main(String[] args) throws InterruptedException 
		{
			while(true)
			{
			try {
				IPrakrutiService service=new PrakrutiServiceLocator().getBasicHttpBinding_IPrakrutiService();
				
				String deviceId = "48B57E294480";
				String data=service.getDeviceDataByDeviceId(deviceId);
				
				String data1=service.getAvgDeviceData(deviceId);
				
				System.out.println(data);
				System.out.println(data1);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//TimeUnit.MINUTES.sleep(16);
			
			
			}
		
		}
	}
