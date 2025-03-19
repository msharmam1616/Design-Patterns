public class Number implements CalculatorSystem{

    int num;
    Number(int num){
        this.num= num;
    }

    @Override
    public int evaluate(){
        return num;
    }
}
