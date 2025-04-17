public class ExtraOnionDecorator extends ToppingDecorator{

    ExtraOnionDecorator(BasePizza basePizza){
        this.basePizza= basePizza;
    }


    @Override
    public int cost(){
        return this.basePizza.cost()+10;
    }
}
