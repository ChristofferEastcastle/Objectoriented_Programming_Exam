import java.io.File;

public class TestProgram {
    private Storage storage;

    public TestProgram(){
        storage = readFileToStorage();
    }
    public void runAllTests(){

        System.out.println("Testing printBallsNeedingMoreAir() :\n------------------------------------------------");
        testPrintBallsNeedingMoreAir();
        System.out.println("\n");

        System.out.println("Testing printEquipmentNeedingToBeReplaced() :\n------------------------------------------------");
        testPrintEquipmentNeedingToBeReplaced();
        System.out.println("\n");

        System.out.println("Testing printTableTennisRacketsNeedingNewCoating() :\n------------------------------------------------");
        testPrintTableTennisRacketsNeedingNewCoating();
        System.out.println("\n");
    }

    public void testPrintBallsNeedingMoreAir(){
        storage.printBallsNeedingMoreAir();
    }

    public void testPrintEquipmentNeedingToBeReplaced(){
        storage.printEquipmentNeedingToBeReplaced();
    }

    public void testPrintTableTennisRacketsNeedingNewCoating(){
        storage.printTableTennisRacketsNeedingNewCoating();
    }

    private Storage readFileToStorage(){
        Reader reader = new Reader();
        Storage storage = reader.readFile(new File("equipment.txt"));
        return storage;
    }
}
