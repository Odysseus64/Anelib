function displayTime() {
    var currentTime = new Date();
    var hours = currentTime.getHours();
    var minutes = currentTime.getMinutes();
    var seconds = currentTime.getSeconds();

    // Добавляем ноль, если число меньше 10
    if (hours < 10) {
        hours = "0" + hours;
    }
    if (minutes < 10) {
        minutes = "0" + minutes;
    }
    if (seconds < 10) {
        seconds = "0" + seconds;
    }

    // Формируем строку времени
    var timeString = hours + ":" + minutes + ":" + seconds;

    // Отображаем время на странице
    document.getElementById("clock").innerHTML = timeString;
}

// Обновляем время каждую секунду
setInterval(displayTime, 1000);
