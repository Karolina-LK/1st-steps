package VariousExercises;

interface ATM {

        void cashIn();

        void cashOut();

        default void connectBank() {

        System.out.println("Initiating contact with the Bank");
        }

        static String closeContactWithBank() {

        return "The contact with the Bank has been cancelled";
        }

}