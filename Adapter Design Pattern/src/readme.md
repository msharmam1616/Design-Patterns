Weight machine using adapter design pattern:

1) first we have the adaptee or the existing interface whose behaviour is known to us, in this case it's the weighing scale which gives pounds as the result 


2) now we create an adapter which will contain the legacy interface object and WILL CONTAIN the methods needed by the client (passing the object via contructor in WeightMachineAdapterImpl results in loose coupling).


3) in the end we just perform the conversion and pass the result back to the client needing it.
