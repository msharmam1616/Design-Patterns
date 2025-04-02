package Adapter;

import Adaptee.WeightMachinePounds;
import Adaptee.WeightMachinePoundsImpl;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    final WeightMachinePounds weightMachinePounds;

    public WeightMachineAdapterImpl(WeightMachinePounds weightMachinePounds){
        this.weightMachinePounds= weightMachinePounds;
    }

    @Override
    public double getWeight(){
        return this.weightMachinePounds.getWeight() * 0.45;
    }
}
