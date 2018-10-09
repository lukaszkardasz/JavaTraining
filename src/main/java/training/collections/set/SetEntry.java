package training.collections.set;

class SetEntry implements Comparable{
    private String name;

    public SetEntry(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}