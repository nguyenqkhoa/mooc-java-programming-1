
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares)
            return true;
        return false;
    }

    public int priceDifference(Apartment compared){
        int ourPrice = this.squares * this.princePerSquare;
        int theirPrice = compared.squares * compared.princePerSquare;
        return Math.abs(ourPrice-theirPrice);
    }

    public boolean moreExpensiveThan(Apartment compared){
        int ourPrice = this.squares * this.princePerSquare;
        int theirPrice = compared.squares * compared.princePerSquare;
        if(ourPrice > theirPrice)
            return true;
        return false;
    }

}
