package com.dinesh.org.SocialInteractionManagementApp.service;

import com.dinesh.org.SocialInteractionManagementApp.exception.DuplicateWebsiteException;
import com.dinesh.org.SocialInteractionManagementApp.model.Website;

public interface WebsiteService
{
	public Boolean addWebSite(Website webSite) throws DuplicateWebsiteException;
	
	public boolean deleteWebSite(String url);

	public boolean listAllRecords(String fileName);
}
