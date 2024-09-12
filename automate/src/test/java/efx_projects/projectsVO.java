package efx_projects;

import java.util.List;

public class projectsVO {

    private List<efx_projects.projectsVO> Users;
    public List<efx_projects.projectsVO> getUsers() {
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

    public void setUsers(List<efx_projects.projectsVO> users) {
        Users = users;
    }
}