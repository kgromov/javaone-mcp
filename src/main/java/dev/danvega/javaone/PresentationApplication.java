package dev.danvega.javaone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PresentationApplication {
    private static final Logger log = LoggerFactory.getLogger(PresentationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PresentationApplication.class, args);
    }

    @Bean
    public List<ToolCallback> mcpTools(PresentationMcpService mcpService) {
        log.info("Creating MCP tools...");
        return List.of(ToolCallbacks.from(mcpService));
    }
}
