package bank;

/**
 * @Auther: hl
 * @Date: 2019/7/9 11:26
 * @Description:
 */
public class MainClass {

    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA personA = new PersonA(bank, "counter");
        PersonB personB = new PersonB(bank, "ATM");
        personA.start();
        personB.start();
    }
}
