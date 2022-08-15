package nicolas2lee.tutorial.javaspringbootquickstart.domain;

public class User {
  private Long id;
  private String username;
  private String password;
  private String email;

  public User(long id, String username, String password, String email) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }
}
