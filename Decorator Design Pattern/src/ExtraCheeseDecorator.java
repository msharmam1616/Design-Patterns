public class ExtraCheeseDecorator extends ToppingDecorator{

    ExtraCheeseDecorator(BasePizza basePizza){
        this.basePizza= basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
