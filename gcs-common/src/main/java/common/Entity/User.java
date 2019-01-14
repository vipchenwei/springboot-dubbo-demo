package common.Entity;

import java.io.Serializable;

/**
 * @Author cjw
 * @Date 2019/1/10 17:48
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2316115220681476383L;
    private Integer id;
    private String username;
    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
