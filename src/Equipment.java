import java.util.Objects;

public class Equipment {
    private int ID;
    private Locker locker;
    private boolean needsReplacement;

    @Override
    public String toString() {
        return "Equipment{" +
                "ID=" + ID +
                ", locker=" + locker +
                ", needsReplacement=" + needsReplacement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;
        Equipment equipment = (Equipment) o;
        return ID == equipment.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Locker getLocker() {
        return locker;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }

    public boolean needsReplacement() {
        return needsReplacement;
    }

    public void setNeedsReplacement(boolean needsReplacement) {
        this.needsReplacement = needsReplacement;
    }
}
