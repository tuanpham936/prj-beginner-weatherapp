const ctx = document.getElementById('tempChart').getContext('2d');

new Chart(ctx, {
  type: 'line',
  data: {
    labels: ['00:00', '03:00', '06:00', '09:00', '12:00', '15:00', '18:00', '21:00', '24:00'],
    datasets: [{
      label: 'Temperature (°C)',
      data: [0, 0, 0, 0, 0, 0, 0, 0, 0],
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

        temperature.textContent = json.temperature;
        location.textContent = json.location;
        condition.textContent = json.condition;
        pressure.textContent = json.pressure;
        wind.textContent = json.wind;
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