package efx_717;

import java.util.List;

public class loginVO {

    private List<efx_717.loginVO> Users;
    public List<efx_717.loginVO> getUsers() {
        return Users;
    }

    private String username;
    private String password;
    private String otp;

    // Getters and setters

    public String getUsername() {return username;}

    public String getPassword() {return password;}

    public String getOtp() {return otp;}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOtp(String otp) {
        System.out.println("NEWWWWWWW");
        this.otp = otp;
    }


    public void setUsers(List<loginVO> users) {
        Users = users;
    }
}
