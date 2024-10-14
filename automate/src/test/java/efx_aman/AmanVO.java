package efx_aman;

import java.util.List;

    public class AmanVO {

        private List<efx_aman.AmanVO> Users;
        public List<efx_aman.AmanVO> getUsers() {
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

        public void setUsers(List<efx_aman.AmanVO> users) {
            Users = users;
        }
    }

