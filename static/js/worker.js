
const chatSocket = new WebSocket(
    'ws://localhost:8080/alarmsocket/'
);

chatSocket.onopen = function(e){
    console.log("hello")

}
chatSocket.onmessage = function(e) {
    const data = JSON.parse(e.data);
    console.log(data);
};

chatSocket.onclose = function(e) {
    //location.reload();
    console.error('Chat socket closed unexpectedly');
};
