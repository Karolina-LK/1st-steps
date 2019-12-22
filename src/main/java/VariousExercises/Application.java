package VariousExercises;

class Application {

    public static void main (String[] args)
    {
        ATM ATMImpl = new ATMImpl();

        ATMImpl.connectBank();
        ATMImpl.cashIn();
        ATMImpl.cashOut();
        System.out.println(ATM.closeContactWithBank());
    }

}