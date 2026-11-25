package com.krachel.fahd.transactionservice.web;

import com.krachel.fahd.transactionservice.agents.TransactionIaAgent;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AiAgentController {
    private TransactionIaAgent transactionIaAgent;

    public AiAgentController(TransactionIaAgent transactionIaAgent) {
        this.transactionIaAgent = transactionIaAgent;
    }
    @GetMapping("/askAgent")
    public String chat(@RequestParam(defaultValue = "Bonjour") String question){
        return transactionIaAgent.chat(question);
    }
}
