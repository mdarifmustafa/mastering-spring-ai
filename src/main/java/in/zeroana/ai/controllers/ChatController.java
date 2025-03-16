package in.zeroana.ai.controllers;

import in.zeroana.ai.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    ChatService chatService;

    @GetMapping("/chat")
    public String chat(@RequestParam(
        value="message",
        defaultValue="Give me java hello world program ?") String message) {
        return chatService.getMessage(message);
    }
}
