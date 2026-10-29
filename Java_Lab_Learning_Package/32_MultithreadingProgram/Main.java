class MyThread extends Thread {
    String name;

    MyThread(String n) { name = n; }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + ": " + i);
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}

class Bank {
    int bal = 1000;

    synchronized void withdraw(String name, int amt) {
        if (amt <= bal) {
            try { Thread.sleep(100); } catch (Exception e) {}
            bal -= amt;
            System.out.println(name + " withdrawn " + amt + ", Balance: " + bal);
        } else {
            System.out.println(name + " insufficient balance");
        }
    }
}

class Customer extends Thread {
    Bank b;
    int amt;

    Customer(String n, Bank b, int amt) {
        super(n);
        this.b = b;
        this.amt = amt;
    }

    public void run() {
        b.withdraw(getName(), amt);
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        Bank bank = new Bank();
        Customer c1 = new Customer("Arun", bank, 700);
        Customer c2 = new Customer("Anu", bank, 500);
        c1.start();
        c2.start();
    }
}
