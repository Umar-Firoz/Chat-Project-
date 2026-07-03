package com.demo.chatproject.controller;

import com.demo.chatproject.dto.ChatRequestDTO;
import com.demo.chatproject.dto.ChatResponseDTO;
import com.demo.chatproject.service.ChatService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping("/sendMesage")
    @SendTo("/topic/message")
    public ChatResponseDTO chatResponseDTO(ChatRequestDTO chatRequestDTO){
        return chatService.processMessage(chatRequestDTO);
    }
}
