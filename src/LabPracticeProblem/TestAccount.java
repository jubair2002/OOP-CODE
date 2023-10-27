package LabPracticeProblem;
public class TestAccount {
    public static void main(String[] args) {
        Account a= new Account("123","abir",200);
        System.out.println(a.credit(10));
        System.out.println(a.debit(100));

        System.out.println(a);
    }
}
