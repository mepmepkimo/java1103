package practice2;

public class Account {

    String name;
    private int balance;

    void setBalance(int money) {
        if (money > 0) {
            balance += money;
            System.out.printf("存款%d成功!\n", money);
        } else {
            System.out.printf("存款%d失敗()存款金額必須大於0!\n", money);

        }
    }

    void withdraw(int money) {
        if (money > 0 && balance >= money) {
            balance -= money;
            System.out.printf("提款%d 成功 !\n", money);
        } else {
            System.out.printf("withdraw %d fail(withdraw value must bigger then 0 or no balance)!\n", money);
        }
    }
    // print out the balance

    void printBalance() {
        System.out.printf("name:%s,balance:%,d\n", name, balance);
    }

    //轉帳
    void transfer(int money, Account ac) {
        if (money > 0 &&balance>= money) {
            withdraw(money);
            ac.setBalance(money);
            
        }
    }
}
