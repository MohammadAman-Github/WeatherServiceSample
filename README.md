# ⛅ Weather Service Sample

This is a simple Spring Boot REST API that integrates with the OpenWeatherMap API to fetch real-time weather data based on geographical coordinates (latitude and longitude).

## 📌 Features

- Fetch live weather info from OpenWeatherMap API
- Parses external API response using DTOs
- Clean separation of concerns using Controller, Service, and DTO layers
- Lightweight and modular structure

## 🌦️ API Used

- **[OpenWeatherMap API](https://openweathermap.org/current)**  
  This service is consumed via `RestTemplate` to get weather details.

---

## 🧱 Project Structure

WeatherServiceSample/
├── Controller/
│ └── Controller.java
├── DTOs/
│ └── WeatherServiceDTO.java
├── Models/
│ └── WeatherInfo.java
├── Service/
│ ├── WeatherAppService.java
│ └── WeatherService.java (interface)


### ➕ Key Layers

- **Controller**: Exposes REST endpoint
- **Service**: Contains business logic to call OpenWeatherMap
- **DTOs**: Maps raw JSON response from the weather API
- **Model**: A clean representation of weather data returned to clients

---

## 🚀 How to Run

### 📋 Prerequisites
- Java 22
- Maven or Gradle
- Internet connection (for weather API)

### 🔧 Run the Project

🌐 Endpoint

GET /weather/now/longs/{longitude}/lats/{latitude}

🔍 Example:

GET http://localhost:8080/weather/now/longs/77.1025/lats/28.7041

✅ Sample Response

{
  "longs": 77.1025,
  "lats": 28.7041,
  "temp": 304.15,
  "mintemp": 302.15,
  "maxtemp": 306.15,
  "pressure": 1012,
  "humidity": 65,
  "sea_level": 1012
}

⚙️ Tech Stack

- Java 22    

- Spring Boot

- REST APIs

- OpenWeatherMap API

- ombok for boilerplate reduction

- Jackson for JSON mapping

📌 Learning Outcomes

- Consuming external APIs using RestTemplate    

- DTO mapping from third-party responses

- Layered architecture in Spring Boot

- Real-world API integration & testing

👨‍💻 Author

Handled by Mohammad Aman
Java Backend Developer – Spring Boot, REST APIs, Microservices
GitHub Profile » https://github.com/MohammadAman-Github
