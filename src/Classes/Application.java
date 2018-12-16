package Classes;

import Pojos.Employee;
import Pojos.MyCompanyDetails;

public class Application {

    private static Employee emp;
    private static MyCompanyDetails company;
    private static boolean isCompanySet;
    private static String langu = "ENG";
    
    public static final String SINWARN ="අනතුරු ඇඟවීමකි";//2
    public static final String SINSUCCESS ="සාර්ථකයි";//1
    public static final String SINERROR ="දෝෂයකි";//0
    public static final String SININFO ="නිවේදනයකි";

    public static void setEmp(Employee emp) {
        Application.emp = emp;
    }

    public static Employee getEmp() {
        return emp;
    }

    public static void setCompany(MyCompanyDetails company) {
        Application.company = company;
        isCompanySet = true;
    }

    public static MyCompanyDetails getCompany() {
        return company;
    }

    public static boolean isCompanySet() {
        return isCompanySet;
    }

    public static void setLangu(String langu) {
        Application.langu = langu;
    }

    public static String getLangu() {
        return langu;
    }

    
}
