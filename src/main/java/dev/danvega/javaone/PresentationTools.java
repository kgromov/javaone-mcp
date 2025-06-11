package dev.danvega.javaone;

import java.util.List;

import static java.util.Objects.isNull;


public class PresentationTools {

    private final List<Presentation> presentations;

    public PresentationTools() {
        this.presentations = List.of(
                new Presentation("Java 24 Launch - Live from JavaOne 2025", "https://www.youtube.com/watch?v=mk_2MIWxLI0", 2025),
                new Presentation("Java Turns 30 - Live from JavaOne 2025", "https://www.youtube.com/watch?v=GwR7Gvi80Xo", 2025),
                new Presentation("Concerto for Java & AI - Building Production-Ready LLM Applications","https://www.youtube.com/watch?v=MhILqEAscss", 2025),
                new Presentation("Stream Gatherers - Deep Dive with the Expert","https://www.youtube.com/watch?v=v_5SKpfkI2U&t=6s", 2025),
                new Presentation("AI 202: Next-Level AI Mastery for Java Developers","https://www.youtube.com/watch?v=DIyj_V8h8X0",2025),
                new Presentation("Sequenced Collections - Deep Dive with the Expert","https://www.youtube.com/watch?v=6yuDqkkYTGU",2025)
        );
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }

    public List<Presentation> getPresentationsByYear(int year) {
        return presentations.stream().filter(p -> p.year() == year).toList();
    }

    public List<Presentation> searchPresentationsByTitle(String title) {
        if (isNull(title) || title.isBlank()) {
            return presentations;
        }
        return presentations.stream()
                .filter(p -> p.title().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
