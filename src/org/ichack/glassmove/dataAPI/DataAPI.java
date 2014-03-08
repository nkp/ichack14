package org.ichack.glassmove.dataAPI;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataAPI {

	private Result result;

	// Fetches a list of Properties from Zoopla
	public static Property[] fetchProperties(String location) throws Exception {

		String url;
		
		List<Property> output = new LinkedList<Property>();

		// set parameters and compose url
		// hardcoded for now
		String base_url = "http://api.zoopla.co.uk/api/v1/property_listings.js";
		String api_key = "t4qqvh85juymku28brbt2rxk";
		String postcode = "sw7";
		String order_by = "price";
		String ordering = "ascending";

		url = base_url + "?" + "api_key=" + api_key + "&postcode=" + postcode
				+ "&order_by=" + order_by + "&ordering=" + ordering;

		// get json
		JSONObject json = ZooplaRequest.getJSON(url); 
		
		JSONArray properties = json.getJSONArray("listing");
		
	
		
		// iterate through json and create single properties and add to array
	
		JSONObject property;
		
		for (int i = 0; i < properties.length(); i++) {
			property = properties.getJSONObject(i);
			
		}
		

		return null;
	}

	// Uses all the APIs to create a single Result
	public static Result getResult(String location) {

		return null;
	}

}
