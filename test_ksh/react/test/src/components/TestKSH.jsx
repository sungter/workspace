import axios from 'axios';
import React, { useEffect, useState } from 'react'

const TestKSH = () => {
  const [weather, setWeather] = useState(null);
  const [location, setLocation] = useState({ lat: null, lon: null });
  const API_KEY = "d2a371b0579c616f5a7b1edc780996c0"; // 여기에 OpenWeatherMap API 키 입력

  useEffect(() => {
    // 사용자 위치 가져오기
    navigator.geolocation.getCurrentPosition(
      (position) => {
        const { latitude, longitude } = position.coords;
        setLocation({ lat: latitude, lon: longitude });
      },
      (error) => {
        console.error("위치 정보를 가져올 수 없습니다.", error);
      }
    );
  }, []);

  const weatherIcons = {
    Clear: "🌞",
    Clouds: "☁️",
    Rain: "🌧️",
    Thunderstorm: "⛈️",
    Snow: "❄️",
    Mist: "🌫️",
  };

  useEffect(() => {
    if (location.lat && location.lon) {
      const fetchWeather = async () => {
        try {
          const response = await axios.get(
            `https://api.openweathermap.org/data/2.5/weather?lat=${location.lat}&lon=${location.lon}&appid=${API_KEY}&units=metric&lang=kr`
          );
          setWeather(response.data);
        } catch (error) {
          console.error("날씨 데이터를 가져오는 중 오류 발생:", error);
        }
      };

      fetchWeather();

      // 10초마다 데이터 업데이트
      const interval = setInterval(() => {
        fetchWeather();
      }, 10000);

      // 클린업 함수 (컴포넌트가 언마운트될 때 setInterval 정리)
      return () => clearInterval(interval);
    }
  }, [location]);

  return (
    <div>
      <h1>현재 위치의 날씨</h1>
      {weather ? (
        <div>
          <p>온도: {weather.main.temp}°C</p>
          <p>습도: {weather.main.humidity}%</p>
          <p>날씨: {weather.weather[0].description} {weatherIcons[weather.weather[0].main] || "🌍"} </p>
          <img
          src={`https://openweathermap.org/img/wn/${weather.weather[0].icon}@2x.png`}
          alt={weather.weather[0].description}
          />
        </div>
      ) : (
        <p>위치 정보를 가져오는 중...</p>
      )}
    </div>
  )
}

export default TestKSH