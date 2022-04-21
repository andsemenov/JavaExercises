package Interfaces.task2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Child size: " + getSize();
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int size;
    public String getDescription () {
        return "Adult size: " + size;
    }

     Size(int euroSize) {
        this.size = euroSize;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + size +
                '}';
    }
}

