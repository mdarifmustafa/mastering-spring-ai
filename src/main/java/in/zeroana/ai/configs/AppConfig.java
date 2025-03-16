package in.zeroana.ai.configs;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {

    @Value("classpath:defaultSystem.txt")
    Resource resource;

    @Bean
    public ChatClient myCustomChatClientBuilder(ChatClient.Builder chatClientBuilder) {
        return chatClientBuilder.defaultSystem(resource)
            .build();
    }
}
