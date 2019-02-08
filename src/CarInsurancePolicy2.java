public class CarInsurancePolicy2 {
    private int policyNumebr;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy2(int num, int payments, String city){
        policyNumebr = num;
        numPayments = payments;
        residentCity = city;
    }
    public CarInsurancePolicy2(int num, int payments){
        this(num, payments, "Mayfield");

    }


    public CarInsurancePolicy2(int num){
        this(num, 2, "Mayfield");

    }

    public void display(){
        System.out.println("Policy # " + policyNumebr + ". " + numPayments + "payments annually. Drivers reside in " + residentCity + "." );
    }
}
