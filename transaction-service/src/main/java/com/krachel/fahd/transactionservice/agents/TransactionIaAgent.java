package com.krachel.fahd.transactionservice.agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

git
public interface TransactionIaAgent {
    @SystemMessage("""
            You are a good assistant that can answer the user's question using context.
            """)
    String chat(String question);
}
