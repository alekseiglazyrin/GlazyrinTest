public class Main {
        public static void main(String[] args) {

            Integer companyId = 777;
            String name = "Izergil";

            CompanyRepository.initAllComponies();
            Endpoint.getUserInformationEnp(companyId, name);

        }

}