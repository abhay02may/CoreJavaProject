package com.cred.java9.HttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttepClientAsyncCall {

	private static final String POST_API_URL="https://jsonplaceholder.typicode.com/posts";
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		HttpClient httpClient=HttpClient.newHttpClient();
		HttpRequest httpRequest=HttpRequest.newBuilder(URI.create(POST_API_URL)).GET().header("accept", "application/json").build();
		// sendAsyc method returns the CompletableFuture object which can be used to check the completion of job
		CompletableFuture<HttpResponse<String>> completableFuture = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString());
		int count=0;
		while(completableFuture.isDone()) {
			System.out.println(" Do something else and check the resposne:"+count++);
		}
		HttpResponse<String> httpResponse=completableFuture.get();
		System.out.println(httpResponse.statusCode());
		System.out.println(httpResponse.body());
		System.out.println(httpResponse.headers());
		
	}

}
