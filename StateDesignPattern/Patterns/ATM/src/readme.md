

ATM using state design pattern



Used 3 states, Idle -> active -> dispersal/active -> Idle


Actions used:
Insert card, show balance, withdraw amount, canceltransaction, selectAmount.


Denomination handler class maintains the count of all the currency units, the implementations just use gets/sets.


ATM object carries the user manager, the current user and the amount present in the ATM, along with denominations object.