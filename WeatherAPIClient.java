/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weatherapiclient;

/**
 *
 * @author neeli
 */


   // package weatherapiclient;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherAPIClient {

    public static void main(String[] args) {
        System.setProperty("https.protocols", "TLSv1.2");

        // Replace with your OpenWeatherMap API key
        // Get user input for city
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city name: ");
        String city = scanner.nextLine(); // Accepts the city name from the user
        scanner.close();
        String apiKey = "d276fdbb80563a3f02d635d2c9754c8d";
        
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            // Step 1: Create HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Step 2: Build the HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .GET()
                    .build();

            // Step 3: Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

             String responseBody = response.body();
            System.out.println("Response Body: " + responseBody); // This prints the entire JSON response

            
            // Step 4: Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.body());

            // Extract relevant data
            JSONArray weatherArray = jsonResponse.getJSONArray("weather");
            String weatherDescription = weatherArray.getJSONObject(0).getString("description");
            double tempCelsius = jsonResponse.getJSONObject("main").getDouble("temp");
           // double tempCelsius = tempKelvin - 273.15; // Convert Kelvin to Celsius

            // Step 5: Display the data
            System.out.println("City: " + city);
            System.out.println("Weather: " + weatherDescription);
           System.out.println("Temperature: " + String.format("%.2f", tempCelsius) + "\u00B0C");

  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


