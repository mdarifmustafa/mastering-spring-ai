package in.zeroana.ai.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    ChatClient chatClient;

    public String getMessage(String message) throws NullPointerException {
        ChatResponse chatResponse = chatClient.prompt()
            .user(message)
            .call()
            .chatResponse();

        return chatResponse.getResult()
            .getOutput()
            .getText();

    }


}
