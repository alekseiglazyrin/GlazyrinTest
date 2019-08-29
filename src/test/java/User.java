public class User {

    private String name;
    private Company userCompany;

    public User(String name, Company userCompany) {
        this.name = name;
        this.userCompany = userCompany;
    }

    public String getName() {
        return name;
    }

    public Integer getCompanyId() {
        return userCompany.getId();
    }
}
