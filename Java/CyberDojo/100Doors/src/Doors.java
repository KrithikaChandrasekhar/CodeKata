public class Doors {
    private boolean[] doors;

    public Doors(int numDoors) {
        if (numDoors < 0)
            throw new IllegalArgumentException("Number of doors cannot be negative");
        doors = new boolean[numDoors];
    }
    public boolean[] getDoorsState() {
        return doors;
    }

    public void toggleOnce() {
        for (int door = 0; door < doors.length; door++)
            doors[door] = !doors[door];
    }

    public void toggleHundredth() {
        int numDoors = doors.length;
        for (int pass = 1; pass <= numDoors; pass++) {
            for (int door = pass - 1; door < numDoors; door += pass)
                doors[door] = !doors[door];
        }
    }
}
