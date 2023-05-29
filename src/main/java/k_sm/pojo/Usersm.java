package k_sm.pojo;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14.8.22 2:03 PM
 */
public class Usersm {
    private Integer userId;
    private  String uName;
    private  String uPass;

    public Usersm() {
    }

    public Usersm(Integer userId, String uName, String uPass) {
        this.userId = userId;
        this.uName = uName;
        this.uPass = uPass;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    @Override
    public String toString() {
        return "Usersm{" +
                "userId=" + userId +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }
}
