package efx_717;

import java.util.List;

public class loginVO {

    private List<loginVO> users;
    private String username;
    private String password;
    private String otp;

    // Getters and Setters
    public List<loginVO> getUsers() {
        return users;
    }

    public void setUsers(List<loginVO> users) {
        this.users = users;
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

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        System.out.println("Setting OTP");
        this.otp = otp;
    }
}
