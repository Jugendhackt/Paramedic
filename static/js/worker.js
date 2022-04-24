
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
    //const data = JSON.parse(e.data);
    document.getElementById('alarm_display').innerHTML = e.data
    document.getElementById('alarm_display').className = "m-4 p-3 bg-success bg-gradient rounded bg-error"
};

chatSocket.onclose = function(e) {
    //location.reload();
    new Notification("Verbdinung verloren")
    console.error('Chat socket closed unexpectedly');
};
