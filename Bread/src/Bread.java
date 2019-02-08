public class Bread {

public  String breads;
public  int calorie;
public  String motto = "The staff of life";

public Bread(String breadtype, int calories){
    breads = breadtype;
    calorie = calories;

}
void display(){
    System.out.println("Breadtype; " + breads + " calories: " + calorie);
    System.out.println("Motto: " + motto);
}

}
