package com.cred.java9.HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpClient2Demo {

	private static final String POST_API_URL="https://jsonplaceholder.typicode.com/posts";
	
	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient httpClient=HttpClient.newHttpClient();
		HttpRequest httpRequest=HttpRequest.newBuilder()
								.GET()
								.header("accept", "application/json")
								.uri(URI.create(POST_API_URL))
								.build();
		
		HttpResponse<String> httpResponse=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(httpResponse.body());
		ObjectMapper mapper=new ObjectMapper();
		List<Post> posts = mapper.readValue(httpResponse.body(), new TypeReference<List<Post>>() {});
		posts.forEach(System.out::println);
		
	}

}
