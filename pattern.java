
import java.util.LinkedList;

class pattern{
    public static void main(String[]args){
        LinkedList<String> require =new LinkedList<>();
          require.add("Aadhaar");
          require.add("Pan Card");
          require.add("Cibil Score");
        if(require.contains("Aadhaar") && require.contains("Pan Card") && require.contains("Cibil Score")){
            System.out.println("Your Eligible");

        }
        else
        System.out.println("Not Eligible");

    }
}
