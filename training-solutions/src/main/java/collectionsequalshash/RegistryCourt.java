package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("firstCompany","111"));
        companies.add(new Company("secondCompany","222"));
        companies.add(new Company("thirdCompany","333"));

        System.out.println(companies.contains(new Company("firstCompany","111")));
        System.out.println(companies.contains(new Company("secondCompany","222")));
        System.out.println(companies.contains(new Company("thirdCompany","333")));

    }
}
