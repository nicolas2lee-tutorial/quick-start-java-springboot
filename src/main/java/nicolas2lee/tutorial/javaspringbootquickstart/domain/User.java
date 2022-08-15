package nicolas2lee.tutorial.javaspringbootquickstart.domain;

public class User {
  private long userId;
  private String username;
  private String password;
  private String email;

  public User(long userId, String username, String password, String email) {
    this.userId = userId;
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public long getUserId() {
    return userId;
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
