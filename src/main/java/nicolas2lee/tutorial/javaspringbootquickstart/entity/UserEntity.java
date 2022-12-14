package nicolas2lee.tutorial.javaspringbootquickstart.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import nicolas2lee.tutorial.javaspringbootquickstart.domain.User;

@Entity
@Table(name = "users")
public class UserEntity {
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "email")
  private String email;

  @OneToMany(mappedBy = "creator")
  private List<PostEntity> postEntities;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<PostEntity> getPosts() {
    return postEntities;
  }

  public void setPosts(List<PostEntity> postEntities) {
    this.postEntities = postEntities;
  }

  public User toDomain() {
    return new User(id, username, password, email);
  }
}
