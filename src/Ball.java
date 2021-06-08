public class Ball extends Equipment {
    private BallType type;
    private boolean needsAirRefill;

    public BallType getType() {
        return type;
    }

    public void setType(BallType type) {
        this.type = type;
    }

    public boolean needsAirRefill() {
        return needsAirRefill;
    }

    public void setNeedsAirRefill(boolean needsAirRefill) {
        this.needsAirRefill = needsAirRefill;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type=" + type +
                ", needsAirRefill=" + needsAirRefill +
                "} " + super.toString();
    }
}
