import java.io.*;
import java.util.Scanner;


public class AdventDay1 {

    private int total;

    public int getTotal() {
        return total;
    }

    public AdventDay1() {
        total = 0;
    }

    public int getTotalMass(Scanner scanner) throws IOException {

        int currentModule;
        while(scanner.hasNextInt()){
            currentModule = scanner.nextInt();

            currentModule = currentModule/3;
            currentModule = currentModule-2;

            total += currentModule;
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Jeffrey\\IdeaProjects\\AdventDay1\\.idea\\ModuleFuel.txt"));

        AdventDay1 adventDay1 = new AdventDay1();

        adventDay1.getTotalMass(scanner);

        System.out.println("The total mass is " + adventDay1.getTotal());
    }

}


