from channels.generic.websocket import WebsocketConsumer
from asgiref.sync import async_to_sync

class AlarmConsumer(WebsocketConsumer):
    def connect(self):
        # self.room_group_name = "test"
        
        # await self.channel_layer.group_add(
        #     self.room_group_name,
        #     self.channel_name
        # )
        async_to_sync(self.channel_layer.group_add)("alarm", self.channel_name)
        self.accept()
        


    def disconnect(self, close_code):
        async_to_sync(self.channel_layer.group_discard)("alarm", self.channel_name)


    def receive(self, text_data):
        pass
    
    def send_update(self, event):
        self.send({
            "lat": event["lat"],
            "long": event["long"]
            })
   