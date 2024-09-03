package efx_reports;

import java.util.List;

public class reportsVO {

    private List<efx_reports.reportsVO> Users;
    public List<efx_reports.reportsVO> getUsers() {
        return Users;
    }

    private String username;
    private String password;

    // Getters and setters

    public String getUsername() {return username;}

    public String getPassword() {return password;}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsers(List<efx_reports.reportsVO> users) {
        Users = users;
    }
}