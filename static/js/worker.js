
const chatSocket = new WebSocket(
    'ws://localhost:8080/alarmsocket/'
);

chatSocket.onopen = function(e){
    console.log("hello")

}
chatSocket.onmessage = function(e) {
    //const data = JSON.parse(e.data);
    document.getElementById('alarm_display').innerHTML = e.data
    document.getElementById('alarm_display').className = "m-4 p-3 bg-success bg-gradient rounded bg-error"
    console.log(e);
};

chatSocket.onclose = function(e) {
    //location.reload();
    console.error('Chat socket closed unexpectedly');
};
