public class CreatePolicies {
    public static void main(String[] args){
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456);
        CarInsurancePolicy2 thrid = new CarInsurancePolicy2(789, 12, "Newcastle");
        //CarInsurancePolicy2 fourth = new CarInsurancePolicy2();

        first.display();
        second.display();
        thrid.display();

    }
}
