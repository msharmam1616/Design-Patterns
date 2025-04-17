
1) if you have optional fields in your class, then the constructor might look really ugly or you might have a lot of constructors that relate to setting up of specific fields.
here you have an object and it's corresponding builder, Builder's build() will return the finally built product, this way you separate the object and creation class respectively.

why would you use this pattern?
firstly, this pattern will make sure that the fields aren't changed for the object as there aren't any getters and setters,
secondly, eliminates ugly looking constructors.
third, you can add validation logic to your build() function to prepare the final object based on some additional constraints.

