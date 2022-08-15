package nicolas2lee.tutorial.javaspringbootquickstart.domain;

import nicolas2lee.tutorial.javaspringbootquickstart.entity.PostEntity;

public class Post {
  private Long id;
  private User creator;
  private String content;
  private String lastUpdated;

  public Post(Long id, User creator, String content, String lastUpdated) {
    this.id = id;
    this.creator = creator;
    this.content = content;
    this.lastUpdated = lastUpdated;
  }

  public static Post fromEntity(PostEntity entity) {
    return new Post(
        entity.getPostId(),
        entity.getCreator().toDomain(),
        entity.getContent(),
        entity.getLastUpdated());
  }

  public Long getId() {
    return id;
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
