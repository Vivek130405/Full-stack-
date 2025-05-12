// 23. Use method overriding + has-a relationship (Company has-a CEO)
class CEO {
    private String ceoName;
    public void setCeoName(String name) {
        this.ceoName = name;
    }
    public String getCeoName() {
        return ceoName;
    }
    public void role() {
        System.out.println("CEO manages the company");
    }
}
class Company extends CEO {
    private String companyName;
    public void setCompanyName(String name) {
        this.companyName = name;
    }
    @Override
    public void role() {
        System.out.println("Company controlled by CEO");
        super.role();
    }
    public void display() {
        System.out.println("Company: " + companyName);
        System.out.println("CEO: " + getCeoName());
        role();
    }
}
public class Test23 {
    public static void main(String[] args) {
        Company c = new Company();
        c.setCompanyName("TechZone");
        c.setCeoName("Mr. Sharma");
        c.display();
    }
}
