package in.zeroana.ai.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String generateChatResponse() {
        if (chatClient != null) {
            return chatClient.prompt(new Prompt("Please give me a simple joke?"))
                .call()
                .chatResponse()
                .getResult()
                .getOutput()
                .getText();
        } else {
            return "ChatClient instance not initialized...";
        }
    }


}
