package BitManipulation.poweroftwo;

public class power {
    public static void poweroftwo(int n){
        if ((n & n-1) == 0){
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main (String args[]){
    poweroftwo(10);
    }
}
