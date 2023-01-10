import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Digite um número");
            String number1 = reader.readLine();
            System.out.println("Digite outro número");
            String number2 = reader.readLine();

            for(int j = Integer.parseInt(number1) ; j <= Integer.parseInt(number2) ; j++){
                for(int i = Integer.parseInt(number1) ; i <= j ; i++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
