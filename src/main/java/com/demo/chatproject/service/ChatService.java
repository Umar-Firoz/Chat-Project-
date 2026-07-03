package com.demo.chatproject.service;

import com.demo.chatproject.dto.ChatRequestDTO;
import com.demo.chatproject.dto.ChatResponseDTO;
import com.demo.chatproject.entity.Chat;
import com.demo.chatproject.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatRepository chatRepository;

    public ChatResponseDTO processMessage(ChatRequestDTO chatRequestDTO) {
        Chat chat=new Chat();
        chat.setSender(chatRequestDTO.getSender());
        chat.setContent(chatRequestDTO.getContent());
        Chat savedChat = chatRepository.save(chat);
        return new ChatResponseDTO(

                savedChat.getId(),
                savedChat.getSender(),
                savedChat.getContent(),
                LocalDateTime.now()
        );
    }

}
