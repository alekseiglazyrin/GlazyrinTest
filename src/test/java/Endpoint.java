public class Endpoint {
    private static final String URL = "some_domain.com";
    private static final String NOT_FOUND_CODE = "404";
    private static final String OK_CODE = "200";

    public static String getUserInformationEnp(Integer companyId, String userName){
        String getUrl = URL + "/company/" + companyId + "/?Name=" + userName;
        System.out.println("Your URL is " + getUrl);

        if (!CompanyRepository.validateCompanyAndUserName(companyId, userName)) {
            System.out.println("Sorry, this user is not exist in " + companyId + " Company");
            return NOT_FOUND_CODE;
        }
        System.out.println("Ok :)");
        return OK_CODE;

    }

}
