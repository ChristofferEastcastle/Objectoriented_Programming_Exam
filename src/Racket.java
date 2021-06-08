public class Racket extends Equipment{
    private boolean needsNewCoating;

    @Override
    public String toString() {
        return "Racket{" +
                "needsNewCoating=" + needsNewCoating +
                "} " + super.toString();
    }

    public boolean needsNewCoating() {
        return needsNewCoating;
    }

    public void setNeedsNewCoating(boolean needsNewCoating) {
        this.needsNewCoating = needsNewCoating;
    }
}
