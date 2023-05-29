package g_split.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:40 PM
 */
public class Users {
    private Integer uid;
    private String uname;
    private Integer uage;

    public Users(Integer uid, String uname, Integer uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public Users() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }
}
