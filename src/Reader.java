import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private Storage storage;

    public Reader(){
        storage = new Storage();
    }


    public Storage readFile(File file){
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String type = sc.nextLine();
                switch (type) {
                    case "Ball" -> readBall(sc);
                    case "TableTennisRacket" -> readRacket(sc);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            return storage;
        }
    }

    private void readBall(Scanner sc) {
        Ball ball = new Ball();
        ball.setID(Integer.parseInt(sc.nextLine()));
        Locker locker = getLocker(sc.nextLine()); // Storing in variable for adding to storage later.
        ball.setLocker(locker);
        ball.setNeedsReplacement(Boolean.parseBoolean(sc.nextLine()));
        ball.setType(BallType.valueOf(sc.nextLine().toUpperCase()));
        ball.setNeedsAirRefill(Boolean.parseBoolean(sc.nextLine()));
        storage.addToStorage(locker, ball); // Adding to storage
    }

    private void readRacket(Scanner sc){
        Racket racket = new Racket();
        racket.setID(Integer.parseInt(sc.nextLine()));
        Locker locker = getLocker(sc.nextLine()); // Storing in variable for adding to storage later.
        racket.setLocker(locker);
        racket.setNeedsReplacement(Boolean.parseBoolean(sc.nextLine()));
        racket.setNeedsNewCoating(Boolean.parseBoolean(sc.nextLine()));
        storage.addToStorage(locker, racket); // Adding to storage
    }

    private Locker getLocker(String lockerString){
        return Locker.valueOf(lockerString.replace(' ', '_').toUpperCase());
    }
}
