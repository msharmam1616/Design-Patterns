This is the null object design pattern.

Vehicle is the interface used by VehicleFactory to
create new vehicles based on the params provided. then
if the type isn't known to the factory it will return a generic object.
so in this way you will always avoid the NPE in the vehicle objects.

