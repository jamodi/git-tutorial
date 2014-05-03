package com.sd.service1;

import java.util.HashMap;
import java.util.Map.Entry;


public class ContentBasedRecommendation {


		/*public static HashMap<String,HashMap<String,Integer>> invertedindex=new HashMap<String,HashMap<String,Integer>>();
		public static int count=0;
		public static String answer=null;
		

		
			public static String BuildInvertedIndex(String Domain,String Servicename)
			{   
				count++;
				String domain=Domain.toLowerCase();
				
				String servicename=Servicename.toLowerCase();
				
			
				
				if(invertedindex.containsKey(domain))
				{
					if(invertedindex.get(domain).containsKey(servicename))
					{
						System.out.println("Service Name Already Exists.Please Modify the name of the service and re-publish it");
						return "Service Name Already Exists.Please Modify the name of the service and re-publish it"; 
					}
					else
					{
						invertedindex.get(domain).put(servicename, count);
					
						System.out.println("Successfull submission of the service.");
						return "Successfull submission of the service.";
					
					}
		
				}
				
				else
				{
					HashMap<String,Integer> servicelist=new HashMap<String,Integer>();
					servicelist.put(servicename, count);
					invertedindex.put(domain, servicelist);
					System.out.println("Successfull submission of the service.");
					return "Successfull submission of the service.";
					}
			}
			
			
			public static HashMap<String,Integer> getContentBasedRecommendations(String Domain)
			{
				
				String domain=Domain.toLowerCase();
				System.out.println(invertedindex.get(domain));
				//return invertedindex.get(domain).toString();
				return invertedindex.get(domain);
			}
			*/
			
	public static HashMap<String,HashMap<String,String>> invertedindex=new HashMap<String,HashMap<String,String>>();
	public static int count=0;
	public static String answer=null;
	

	
		public static String BuildInvertedIndex(String Domain,String Servicename,String Description)
		{   
			count++;
			String domain=Domain.toLowerCase();
			
			String servicename=Servicename.toLowerCase();
			
		
			
			if(invertedindex.containsKey(domain))
			{
				if(invertedindex.get(domain).containsKey(servicename))
				{
					System.out.println("Service Name Already Exists.Please Modify the name of the service and re-publish it");
					return "Service Name Already Exists.Please Modify the name of the service and re-publish it"; 
				}
				else
				{
					invertedindex.get(domain).put(servicename, count+","+Description);
				
					System.out.println("Successfull submission of the service.");
					return "Successfull submission of the service.";
				
				}
	
			}
			
			else
			{
				HashMap<String,String> servicelist=new HashMap<String,String>();
				servicelist.put(servicename, count+","+Description);
				invertedindex.put(domain, servicelist);
				System.out.println("Successfull submission of the service.");
				return "Successfull submission of the service.";
				}
		}
		
		
		public static HashMap<String,String> getContentBasedRecommendations(String Domain)
		{
			
			String domain=Domain.toLowerCase();
			System.out.println(invertedindex.get(domain));
			//return invertedindex.get(domain).toString();
			return invertedindex.get(domain);
		}

	}


