import java.util.Scanner;
public class dpi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original sensitivity you'd like to convert from: ");
        float sens1 = scanner.nextFloat();
        System.out.print("Enter the original DPI you'd like to convert from: ");
        float dpi_1 = scanner.nextFloat();
        System.out.print("Enter the new DPI you'd like to convert to: ");
        float dpi_2 = scanner.nextFloat();
        float sens2 = convert_dpi(sens1, dpi_1, dpi_2);
        System.out.print("The new sensitivity is: " + sens2);
        scanner.close();
    }

    public static float convert_dpi(float sens1, float dpi_1, float dpi_2) {
        float e_dpi = sens1 * dpi_1;
        return e_dpi / dpi_2;        
    }


}