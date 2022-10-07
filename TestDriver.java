import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        List<String> databaseList = new ArrayList<String>();

        Scanner sc = new Scanner(new FileReader("database.txt"));
        while (sc.hasNext()) {
            databaseList.add(sc.next());
        }
        sc.close();

        String appleOrganic = databaseList.get(0);
        String appleOrganicPrice = databaseList.get(1);
        String appleNonOrganic = databaseList.get(4);
        String appleNonOrganicPrice = databaseList.get(5);

        String bananaOrganic = databaseList.get(2);
        String bananaOrganicPrice = databaseList.get(3);
        String bananaNonOrganic = databaseList.get(2);
        String bananaNonOrganicPrice = databaseList.get(6);

        OrganicFactory organicFactory = new OrganicFactory();
        Banana organicBanana = organicFactory.createBanana();
        Apple organicApple = organicFactory.createApple();

        NonOrganicFactory nonOrganicFactory = new NonOrganicFactory();
        Banana nonOrganicBanana = nonOrganicFactory.createBanana();
        Apple nonOrganicApple = nonOrganicFactory.createApple();

        System.out.println("The product is");
        organicBanana.getName(bananaOrganic);
        System.out.println("The cost of it is: ");
        organicBanana.getPrice(bananaOrganicPrice);
    }
}
