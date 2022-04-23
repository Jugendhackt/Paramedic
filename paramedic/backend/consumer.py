from channels.generic.websocket import WebsocketConsumer

class AlarmConsumer(WebsocketConsumer):
    def connect(self):
        # self.room_group_name = "test"
        
        # await self.channel_layer.group_add(
        #     self.room_group_name,
        #     self.channel_name
        # )

        self.accept()
        


    def disconnect(self, close_code):
        pass

    def receive(self, text_data):
        pass
    
    def send_update(self, update):
        self.send(update)
   