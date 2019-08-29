import java.util.ArrayList;
import java.util.List;

public class Company {
    private Integer id;

    private List<User> users;

    public Company(Integer id) {
        this.id = id;
        this.users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public Integer getId() {
        return id;
    }
}

