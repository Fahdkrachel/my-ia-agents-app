package com.krachel.fahd.transactionservice.agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService
public interface TransactionIaAgent {
    @SystemMessage("""
            You are a good assistant that can answer the user's question using context.
            """)
    Flux<String> chat(String question);
}
