package nicolas2lee.tutorial.javaspringbootquickstart.domain;

import nicolas2lee.tutorial.javaspringbootquickstart.entity.PostEntity;


public class Post {
    private Long postId;
    private User creator;
    private String content;
    private String lastUpdated;

    public Post(Long postId, User creator, String content, String lastUpdated) {
        this.postId = postId;
        this.creator = creator;
        this.content = content;
        this.lastUpdated = lastUpdated;
    }

    public static Post fromEntity(PostEntity entity){
        return new Post(entity.getPostId(), entity.getCreator().toDomain(), entity.getContent(), entity.getLastUpdated());
    }

    public Long getPostId() {
        return postId;
    }

    public User getCreator() {
        return creator;
    }

    public String getContent() {
        return content;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }
}
