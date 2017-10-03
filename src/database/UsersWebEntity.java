package database;

import javax.persistence.*;

@Entity
@Table(name = "users_web", schema = "cloudpacs", catalog = "")
public class UsersWebEntity {
    private int id;
    private String username;
    private String password;
    private int userLeveId;
    private String firstName;
    private String lastName;
    private String pacsViewer;
    private String hospitalName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "user_leve_id")
    public int getUserLeveId() {
        return userLeveId;
    }

    public void setUserLeveId(int userLeveId) {
        this.userLeveId = userLeveId;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "pacs_viewer")
    public String getPacsViewer() {
        return pacsViewer;
    }

    public void setPacsViewer(String pacsViewer) {
        this.pacsViewer = pacsViewer;
    }

    @Basic
    @Column(name = "hospital_name")
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersWebEntity that = (UsersWebEntity) o;

        if (id != that.id) return false;
        if (userLeveId != that.userLeveId) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (pacsViewer != null ? !pacsViewer.equals(that.pacsViewer) : that.pacsViewer != null) return false;
        if (hospitalName != null ? !hospitalName.equals(that.hospitalName) : that.hospitalName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + userLeveId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (pacsViewer != null ? pacsViewer.hashCode() : 0);
        result = 31 * result + (hospitalName != null ? hospitalName.hashCode() : 0);
        return result;
    }
}
