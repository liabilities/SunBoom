package model;

/**
 * Created by zs on 2016/7/26.
 */
public class UserInf {
    public String id;
    public String email;
    public String sex;
    public String phone;
    public String blog;
    public String address;

    public UserInf(String id, String email, String sex, String phone, String blog, String address) {
        this.id = id;
        this.email = email;
        this.sex = sex;
        this.phone = phone;
        this.blog = blog;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInf{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", blog='" + blog + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
