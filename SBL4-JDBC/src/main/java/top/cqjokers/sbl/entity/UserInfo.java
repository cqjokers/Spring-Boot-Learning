package top.cqjokers.sbl.entity;

/**
 * Created by IntelliJ IDEA
 * Title: UserInfo
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:08
 * Blog: https://cqjokers.top
 * Description:
 */
public class UserInfo {

    private int id;

    private String username;

    private String password;

    private String nickname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
