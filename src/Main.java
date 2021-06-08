import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // -- Task 2, testing by printing each Equipment-object from the storage hashmap.
        //printAllObjects();



        // -- Task 4 running all tests. The methods from task 3 is working properly.
        TestProgram program = new TestProgram();
        program.runAllTests();

        //program.testPrintBallsNeedingMoreAir();

        //program.testPrintEquipmentNeedingToBeReplaced();

        //program.testPrintTableTennisRacketsNeedingNewCoating();
    }

    private static void printAllObjects() {
        Reader reader = new Reader();
        Storage storage = reader.readFile(new File("equipment.txt"));

        for (Map.Entry<Locker, ArrayList<Equipment>> entry : storage.getStorageMap().entrySet()){
            System.out.println(entry.getKey());
            for (Equipment equipment : entry.getValue()) {
                System.out.println(equipment);
                System.out.println();
            }
        }
    }
}
