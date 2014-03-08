package org.ichack.glassmove.dataAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class ZooplaRequest {

	public String getJSONString(String url) throws Exception {

		URL obj = new URL(url); // todo exceptions
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		String inputLine;
		StringBuffer response = new StringBuffer();
		BufferedReader in;

		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		//int responseCode = con.getResponseCode();
		in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();
	}

	public JSONObject getJSONObject(String json) throws JSONException {

		JSONObject object = new JSONObject(json); // todo exception

		return object;

	}
	
	

}
