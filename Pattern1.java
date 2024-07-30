import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = reader.nextInt();
            for(int i = 0; i<num; i++){
                for(int j = 0; j<num; j++){
                    System.out.print("*" + "\t");
                }
                System.err.println();
            }
        }
    }
}    
