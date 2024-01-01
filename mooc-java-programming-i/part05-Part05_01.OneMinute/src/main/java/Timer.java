public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;


    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    public String toString(){

        return this.seconds + ":" + this.hundredths;
    }

    public void advance(){
        this.hundredths.advance();

        if (this.hundredths.value() == 00){
            this.seconds.advance();
        }

    }
}
