package training.collections.MapExamples;

class KeyMapEntry {

    private Integer key;

    public KeyMapEntry(Integer key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}