package com.dinesh.org.SocialInteractionManagementApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.dinesh.org.SocialInteractionManagementApp.exception.DuplicateWebsiteException;
import com.dinesh.org.SocialInteractionManagementApp.model.Website;
import com.dinesh.org.SocialInteractionManagementApp.service.WebsiteService;
import com.dinesh.org.SocialInteractionManagementApp.service.WebsiteServiceImpl;

public class App
{
	private static WebsiteService webSiteService = new WebsiteServiceImpl();
	static Logger logger = Logger.getLogger(App.class);
	static String fileName = "url_score.csv";

	public static void Add(String inputUrl)
	{
		Website webSite = null;
		URL url = null;
		try
		{
			url = new URL(inputUrl);
			int score = Integer.parseInt(url.getPath().split(" ")[1]);
			webSite = new Website();
			webSite.setUrl(inputUrl.split(" ")[0]);
			webSite.setDomain(url.getHost().split("www.")[1]);
			webSite.setSocialScore(score);
			if (webSiteService.addWebSite(webSite))
			{
				logger.info("Website added successfully");
			}
		} catch (DuplicateWebsiteException e)
		{
			logger.info("Problem while adding website: " + e.getMessage());
			e.printStackTrace();
		} catch (MalformedURLException e)
		{
			logger.info("Problem while creating Url: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e)
		{
			logger.error("Problem while adding new Website: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void Remove(String deleteInputUrl)
	{
		if (webSiteService.deleteWebSite(deleteInputUrl))
			logger.info("Delete successfull");
		else
			logger.error("Delete Failed");
	}

	public static void Export()
	{
		logger.info("Export Website Social Score Option Selected");
		if (webSiteService.listAllRecords(fileName))
			logger.info("File" + fileName + " created");
	}
	
	public static String sayHello() {
		return "Hello";		
	}
}
