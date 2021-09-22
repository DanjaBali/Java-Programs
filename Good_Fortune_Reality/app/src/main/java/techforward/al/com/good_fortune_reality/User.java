package techforward.al.com.good_fortune_reality;

public class User {
    private String Uid;
    private String Email;
    private String FullName;
    private String PhoneNumber;
    private String Password;

    public User() {

    }

    public User(String Uid, String email, String FullName, String phoneNumber, String password) {
        this.Uid = Uid;
        this.Email = email;
        this.FullName = FullName;
        this.PhoneNumber = phoneNumber;
        this.Password = password;
    }

    public User(String email, String password) {
        this.Email = email;
        this.Password = password;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String username) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

}
