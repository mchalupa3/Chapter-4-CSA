public class CarInsurancePolicy {
    private int policyNumebr;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int num, int payments, String city){
        policyNumebr = num;
        numPayments = payments;
        residentCity = city;
    }
    public CarInsurancePolicy(int num, int payments){
        policyNumebr = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }

    public CarInsurancePolicy(int num){
        policyNumebr = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }

    public void display(){
        System.out.println("Policy # " + policyNumebr + ". " + numPayments + "payments annually. Drivers reside in " + residentCity + "." );
    }
}
