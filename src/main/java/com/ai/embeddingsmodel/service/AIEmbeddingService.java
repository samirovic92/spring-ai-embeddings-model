package com.ai.embeddingsmodel.service;

import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.ai.openai.OpenAiEmbeddingModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIEmbeddingService {

    private final OpenAiEmbeddingModel embeddingModel;

    public AIEmbeddingService(OpenAiEmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }

    public EmbeddingResponse embed(String message) {
        return this.embeddingModel.embedForResponse(List.of(message));
    }
}
