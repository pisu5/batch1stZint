let btn = document.getElementById("search-addon");
let currTemp = document.getElementById("currTemp");
let inputInput = document.getElementById("inputTag");
let humidity = document.getElementById("humidity");
let windSpeed = document.getElementById("windSpeed");
let condition = document.getElementById("condition");
let logo = document.getElementById("logo");
let city = document.getElementById("city");

let key = "e28ea8c2b98a443d979123949232612";

let searchBar = document.getElementById("search-addon");

searchBar.addEventListener("click", function () {
  console.log("ddsvw");
  let val = inputInput.value;
  inputInput.value = "";
  fetchData(val);
});

//async js3

async function fetchData(cityy) {
  let data = await fetch(
    ` http://api.weatherapi.com/v1/current.json?key=${key}&q=${cityy}&aqi=no`
  );

  let dataObj = await data.json();
  console.log(dataObj);
  screenUpdate(dataObj);
}

function screenUpdate(obj) {
  let temp_data = obj.current.temp_c;
  let wind = obj.current.wind_kph;
  let humi_dity = obj.current.humidity;
  let iconData = obj.current.condition.icon;
  let cond = obj.current.condition.text;
  let cityName = obj.location.name;

  currTemp.innerText = temp_data;
  humidity.innerText = humi_dity;
  windSpeed.innerText = wind;
  condition.innerText = cond;
  logo.setAttribute("src", iconData);
  city.innerText = cityName;
}
