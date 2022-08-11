package nicolas2lee.tutorial.javaspringbootquickstart.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @Column(name = "post_id")
    private Long postId;

    @ManyToOne
    @JoinColumn(name="creator_id", nullable=false)
    private UserEntity creator;

    @Column(name = "content")
    private String content;

    @Column(name = "lastUpdated")
    private String lastUpdated;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long id) {
        this.postId = id;
    }

    public UserEntity getCreator() {
        return creator;
    }

    public void setCreator(UserEntity creatorId) {
        this.creator = creatorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String last_updated) {
        this.lastUpdated = last_updated;
    }
}
