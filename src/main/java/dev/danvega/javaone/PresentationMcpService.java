package dev.danvega.javaone;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresentationMcpService {
    private final PresentationTools presentationTools = new PresentationTools();


    @Tool(name ="get_presentations", description = "Get a list of all presentations from JavaOne")
    public List<Presentation> getPresentations() {
        return presentationTools.getPresentations();
    }

    @Tool(name = "search_presentations", description = "Search presentations by title")
    public List<Presentation> searchPresentationsByTitle(String title) {
        return presentationTools.searchPresentationsByTitle(title);
    }
}
