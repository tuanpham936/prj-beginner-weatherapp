const ctx = document.getElementById('tempChart').getContext('2d');

function createChart(temps) {
  new Chart(ctx, {
    type: 'line',
    data: {
      labels: ['00:00', '01:00', '02:00','03:00', '04:00', '05:00','06:00', '07:00','08:00', '09:00', '10:00', '11:00', '12:00', '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00', '20:00', '21:00', '22:00', '23:00'],
      datasets: [{
        label: 'Temperature (°C)',
        data: temps,
        borderColor: '#ffffff',
        backgroundColor: 'rgba(255, 255, 255, 0.3)',
        fill: true,
        tension: 0.4
      }]
    },
    options: {
      responsive: true,
      plugins: {
        legend: { display: false }
      },
      scales: {
        y: {
          beginAtZero: false,
          ticks: { color: "#fff" },
          grid: { color: "rgba(255,255,255,0.1)" }
        },
        x: {
          ticks: { color: "#fff" },
          grid: { color: "rgba(255,255,255,0.1)" }
        }
      }
    }
  });
}

// createChart([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]);

const today = new Date();
const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
const formattedDate = today.toLocaleDateString('en-US', options);

document.getElementById("weekday").textContent = formattedDate;

if (navigator.geolocation) {
  navigator.geolocation.getCurrentPosition(
    (position) => {
      const latitude = position.coords.latitude;
      const longitude = position.coords.longitude;

      const data = {
        latitude: latitude,
        longitude: longitude
      };

      fetch('/location', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json'
      }, 
        body: JSON.stringify(data)
      })
      .then(res => res.json())
      .then(json => {
        const temperature = document.getElementById('temperature');
        const location = document.getElementById('location');
        const condition = document.getElementById('condition');
        const pressure = document.getElementById('pressure');
        const wind = document.getElementById('wind');
        const today = document.getElementById('today-humidity');
        const tomorrow = document.getElementById('tomorrow-humidity');
        const aftertomorrow = document.getElementById('after-tomorrow-humidity');
        const icons = document.querySelectorAll('.day-icon');
        
        temperature.textContent = json.temperature;
        location.textContent = json.location;
        condition.textContent = json.condition;
        pressure.textContent = json.pressure;
        wind.textContent = json.wind;
        today.textContent = json.todayHumidity;
        tomorrow.textContent = json.tomorrowHumidity;
        aftertomorrow.textContent = json.afterTomorrowHumidity;
        
        for (let i = 0; i < 3; i++) {
          if (json.willItRain[i] === 1) {
            icons[i].className = 'fa-solid fa-cloud-rain';
          }
          else {
            if (json.uv[i] > 5) {
              icons[i].className = 'fa-solid fa-sun';
            }
            else {
              icons[i].className = 'fa-solid fa-cloud-sun';
            }
          }
        }

        createChart(json.temperatureToday);

      })
      .catch(error => {
        alert("Có lỗi xảy ra");
        console.error(error);
      });
    },
    (error) => {
      console.error("Lỗi khi lấy vị trí:", error.message);
    }
  );
} 
else {
  console.log("Trình duyệt không hỗ trợ Geolocation");
}