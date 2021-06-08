import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Storage {
    private HashMap<Locker, ArrayList<Equipment>> storage;

    public Storage(){
        storage = new HashMap<>();
    }

    public void addToStorage(Locker locker, Equipment equipment){
        if (storage.containsKey(locker)){
            storage.get(locker).add(equipment);
        }else {
            ArrayList<Equipment> list = new ArrayList<>();
            list.add(equipment);
            storage.put(locker, list);
        }
    }

    public void printBallsNeedingMoreAir(){
        // Iterating each object in storage
        for (var lockers : storage.values()){
            for (Equipment equipment : lockers){
                // If the equipment is instanceof ball and needs air it will print the object
                if (equipment instanceof Ball && ((Ball) equipment).needsAirRefill())
                    System.out.println(equipment);
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced(){
        for (var lockers : storage.values()){
            for (Equipment equipment : lockers){
                if (equipment.needsReplacement())
                    System.out.println(equipment);
            }
        }
    }
    
    public void printTableTennisRacketsNeedingNewCoating(){
        for (var lockers : storage.values()){
            for (Equipment equipment : lockers){
                if (equipment instanceof Racket && ((Racket) equipment).needsNewCoating()){
                    System.out.println(equipment);
                }
            }
        }
    }

    public HashMap<Locker, ArrayList<Equipment>> getStorageMap() {
        return storage;
    }

}
