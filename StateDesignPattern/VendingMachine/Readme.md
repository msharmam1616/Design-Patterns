
Vending Machine using State Design Pattern:


The following States are allowed along with the operations mentioned.
1) Idle State:
    
    Press Button to Insert   coins.


2) Coin Collection State:
    
    2.1) Insert Coins.
    
    2.2) Cancel Transaction. (which will return all the coins in the coin tray), flow goes back to idle state

    2.3) Proceed to Select Drink



3) Drink/Product Selection

    3.1) Cancel Transaction (Same as above)

    3.2) Product Selection (user will enter the product ID and then will press enter, upon which we will verify if the amount is enough, if yes then it will go to disperse produce state, else, Cancel Transaction.)


4) Dispersal State:
    
    4.1) will just go to the idle state, debatable if required.
