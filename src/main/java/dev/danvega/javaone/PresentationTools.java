package dev.danvega.javaone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PresentationTools {

    private List<Presentation> presentations = new ArrayList<>();

    public PresentationTools() {
        var keynoteOne = new Presentation("Java 24 Launch - Live from JavaOne 2025", "https://www.youtube.com/watch?v=mk_2MIWxLI0", 2025);
        var keynoteTwo = new Presentation("Java Turns 30 - Live from JavaOne 2025", "https://www.youtube.com/watch?v=GwR7Gvi80Xo", 2025);
        this.presentations.addAll(List.of(keynoteOne,keynoteTwo));
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }

    public List<Presentation> getPresentationsByYear(int year) {
        return presentations.stream().filter(p -> p.year() == year).toList();
    }

    public List<Map<String, Object>> getPresentationsAsMapList() {
        return presentations.stream()
                .map(p -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("title", p.title());
                    map.put("url", p.url());
                    map.put("year", p.year());
                    return map;
                })
                .collect(Collectors.toList());
    }

}
