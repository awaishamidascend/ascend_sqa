package efx_717;

import java.util.ArrayList;
import java.util.List;

public class loginVO {

    private List<loginVO> Users;
    private String username;
    private String password;
    private String otp; // Add OTP field

    // Getters and Setters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getOtp() { // Getter for OTP
        return otp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOtp(String otp) { // Setter for OTP
        this.otp = otp;
    }

    public List<loginVO> getUsers() {
        return Users;
    }

    public void setUsers(List<loginVO> users) {
        Users = users;
    }
}
