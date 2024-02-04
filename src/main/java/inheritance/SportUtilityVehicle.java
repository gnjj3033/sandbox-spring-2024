package inheritance;

public abstract class SportUtilityVehicle extends LandCraft {

    protected boolean isOffRoad;
    protected int numberOfSeats;

    public boolean offRoad() {
        return isOffRoad;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
