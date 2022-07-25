Hello Everyone in this repository we are going to see how we have greatd wallet where we can write some functionality like add money,withdraw money and view balance.
We have made a class called Bank which have all the data and function related to it.Then we have our main class which were we will run our code. We will discuss about this class below.

BANK CLASS-
This class have two data:-
1. Name of the account holder.
2. Balance of the owner.Initailly when an user open an account rupees 100 is given to user by bank.

Then we have 3 method in this class which are as follows:-
1.View balance method:-
This functinallity help user to know how much money is there in his or her account.
2.addMoney:-
This method add money to wallet by asking the amount he or shee wants to add.
3.withdrawMoney:-
This method is little trickey.While desining this method we have to keep in mind that user is not able to withraw money if he or she don't have enough balance and we did keep that in mind.And the rest work like normal stuff in which user amount will be deducted from his/her balance when withdrawn.


MAIN CLASS-
This is the main class of our program.Here we first ask Whether user have existing account or want to create new account.If selected existing then user needs to enter usename and password and on selecting new he/she needs to give username and password. After that we give user option to select one out f three functionality that we have discussed above in BANK class.
