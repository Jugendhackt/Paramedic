window.addEventListener('load', () => {
    
    if ('serviceWorker' in navigator) {
        console.log("hello")
        navigator.serviceWorker.register('/static/js/worker.js')
        .then(function(registration) {
        console.log('Registration successful, scope is:', registration.scope);
        })
        .catch(function(error) {
        console.log('Service worker registration failed, error:', error);

        const chatSocket = new WebSocket(
            'ws://172.22.231.133:8080/alarmsocket/'
        );

        chatSocket.onopen = function(e){
            Notification.requestPermission().then(function(result) {
                if(result == "denied"){
                    Notification.requestPermission();
                }else{
                    console.log("connected with notifications")
                    new Notification("Benachrichtigungen aktiviert")
                }
                console.log(result);
            });


        }
        chatSocket.onmessage = function(e) {
            console.log(e);
            const data = JSON.parse(e.data);
            console.log(data);
            new Notification("MELDUNG " + data.was)
            
            


            document.getElementById('alarm_text').innerHTML = "ALARMMELDUNG " + data.was
            const alarm_display = document.getElementById('alarm_display')

            alarm_display.className = "m-4 p-3 bg-error bg-gradient rounded"
            alarm_display.classList.remove("bg-success")
            alarm_display.classList.add("bg-danger")
            alarm_display.classList.add("text-light")

            document.getElementById('map_alarm').src = "https://maps.geoapify.com/v1/staticmap?style=osm-bright-smooth&width=600&height=400&center=lonlat%3A"+ data.long + "%2C" + data.lat + "&zoom=14.3497&marker=lonlat%3A"+ data.long + "%2C" + data.lat + "%3Btype%3Aawesome%3Bcolor%3A%23bb3f73%3Bsize%3Ax-large&apiKey=824a3c5ffaf14051ad87a7a4b1e97720";
            document.getElementById('alarm_info').innerHTML = "Wie viel Personen sind betroffen: " + data.wie_viele + "<br/> Weitere Anmerkungen:"  + data.anmerkungen
        };

        chatSocket.onclose = function(e) {
            //location.reload();
            new Notification("Verbdinung verloren")
            console.error('Chat socket closed unexpectedly');
        };

        });
    }
})