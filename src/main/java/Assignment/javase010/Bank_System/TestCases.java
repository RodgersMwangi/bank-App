package Assignment.javase010.Bank_System;

public class TestCases {

/*
Account Creation
    Account name must have atleast 2 characters
    Id fields must have atleast 6 numeric characters
    If an account number(ID) already exists the application will not accept it
    Failure: application will not accept data not following the above rules
*/

/*
Deposit amounts
    Positive amounts - success
    Negative amounts - fail
    Zero amounts -     fail
*/

/*
Withdrawal Operations
    normal withdrawals -success
    overdraft attempts -checkings account success until overdraft limit reached
                        savings account - fail
    minimum balance enforcement - savings account - 100 is the minimum balance allowed.
*/

/*
Polymorphic behaviour
    bank treating different accounts uniformly - success
    different toString outputs                 - success
*/

/*
Interest applications
    Savings account interest calculation - success
    Checking account (no interest)       - success
*/

}
