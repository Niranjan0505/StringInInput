import java.util.Scanner;
public class StringInInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] inputs =new String[3];
        String target="a";
        System.out.println("Enter three string:");
    for (int i = 0; i < 3; i++ ){
            System.out.println("Input"+(i=1)+":");
            inputs[i]= scanner.nextLine();
        }
        boolean found=false;
    for (String input:inputs){
            if (input.equals(target)){
                found=true;
                break;
            }
        }

    if(found) {
            System.out.println("The target string "+target+" was found");
        }else{
            System.out.println("The target string " +target+"  not found");
        }
        scanner.close();

    }
}
