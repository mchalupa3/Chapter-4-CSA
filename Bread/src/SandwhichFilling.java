public class SandwhichFilling {
    public String fillingType;
    public int caloiresPerServing;

    public SandwhichFilling(int CPS, String Filling){
        fillingType = Filling;
        caloiresPerServing = CPS;
    }


    void display(){
        System.out.println("Filling type: " + fillingType);
        System.out.println("Calories per serving: " + caloiresPerServing);
    }
}
