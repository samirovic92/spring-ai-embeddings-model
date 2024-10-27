package com.ai.embeddingsmodel.controller;

import com.ai.embeddingsmodel.service.AIEmbeddingService;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIEmbeddingController {

    private final AIEmbeddingService embeddingService;

    public AIEmbeddingController(AIEmbeddingService embeddingService) {
        this.embeddingService = embeddingService;
    }

    @PostMapping("/embedding")
    public EmbeddingResponse embed(@RequestBody String message) {
        return this.embeddingService.embed(message);
    }
}