import java.util.ArrayList;
import java.util.List;

public class CompanyRepository {
    public static Company companyOne;
    public static Company companyTwo;
    public static Company companyThree;

    public static void initAllComponies(){
        companyOne = new Company(1);
        User vasia = new User("Vasia", companyOne);
        User ira = new User("Ira", companyOne);
        User kolya = new User("Kolya", companyOne);

        companyOne.addUser(vasia);
        companyOne.addUser(ira);
        companyOne.addUser(kolya);

        companyTwo = new Company(2);
        User roma = new User("Izergil", companyTwo);
        User leha = new User("Leha", companyTwo);
        User vlad = new User("Vlad", companyTwo);

        companyTwo.addUser(roma);
        companyTwo.addUser(leha);
        companyTwo.addUser(vlad);

        companyThree = new Company(777);
        User sasha = new User("Sasha", companyThree);
        User petya = new User("Petya", companyThree);
        User dima = new User("Dima", companyThree);

        companyThree.addUser(sasha);
        companyThree.addUser(petya);
        companyThree.addUser(dima);
    }

    public static boolean validateCompanyAndUserName(Integer companyId, String username){
        List<User> users = new ArrayList<User>();

        users.addAll(companyOne.getUsers());
        users.addAll(companyTwo.getUsers());
        users.addAll(companyThree.getUsers());

        for (User user : users) {
            if (user.getName().equals(username)) {
                if (!user.getCompanyId().equals(companyId)) {
                    return false;
                }
            }
        }
        return true;

    }

}
