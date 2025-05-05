public class Room {
    int numberOfBeds;
    double price;
    boolean dirty;
    boolean occupied;

    public boolean isAvailable() {
      //a.  boolean returnValue = !dirty && !occupied;  // Derived getter this will either be true- this expression( returns a value) is is not dirty and isn't ocupied
        // a. return returnValue;

        if(!dirty && !occupied) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
