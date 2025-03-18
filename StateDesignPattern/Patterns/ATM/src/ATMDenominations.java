package src;

public class ATMDenominations{
     int twoThousand;
     int fiveHundred;
     int  hundred;
     int fifty;
     int capacity;

    public int getTwoThousand() {
        return twoThousand;
    }

    public void setTwoThousand(int twoThousand) {
        this.twoThousand = twoThousand;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    public void setFiveHundred(int fiveHundred) {
        this.fiveHundred = fiveHundred;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    ATMDenominations(int twoThousand, int fiveHundred, int hundred, int fifty){
         this.twoThousand= twoThousand;
         this.fiveHundred= fiveHundred;
         this.hundred= hundred;
         this.fifty= fifty;
         setCapacity();
     }

     public void setCapacity(){
         this.capacity= twoThousand*2000 + fiveHundred*500 + hundred*100 + fifty*50;
     }



}