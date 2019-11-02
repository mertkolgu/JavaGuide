package com.javase._56.thread;

public class AccountDanger implements Runnable {
    private Account acct = new Account();

    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        // birden fazla thread (one, two) "aynı" obje üzerinde (r değişkeni)
        // çalıştıklarında yazma/write
        // // public void withdraw(int amount) {} yaptıklarında RİSK ortaya çıkar!
        // thread safe değildir!
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

//    private void makeWithdrawal(int amt) {
//        if (acct.getBalance() >= amt) {
//            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                //
//            }
//            acct.withdraw(amt);
//            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
//        } else {
//            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw" + acct.getBalance());
//        }
//    }

    // metot synchronized olduğunda aynı anda sadece bir thread girebilir.
    // bu durumda race condition problemini çözmüş olduk.
    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw" + acct.getBalance());
        }
    }
}

class Account {
    // instance değişken üzerinde write işlemi yapıldığında
    // riskli durum söz konusudur.
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
