package pl.degath.blog.topic;

import java.util.UUID;

public class TopicDto {

    private final UUID id;
    private final String name;
    private final String description;

    TopicDto(Topic topic) {
        this.id = topic.getId();
        this.name = topic.getName();
        this.description = topic.getDescription();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
