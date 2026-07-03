package com.demo.chatproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponseDTO {

    private Long id;
    private String sender;
    private String content;
    private LocalDateTime createdAt;

}