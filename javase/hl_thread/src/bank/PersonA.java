package bank;

/**
 * @Auther: hl
 * @Date: 2019/7/9 11:19
 * @Description:
 */
public class PersonA extends Thread {

    Bank bank;
    String mode;

    public PersonA(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {
        while (bank.money >= 100) {
            try {
                bank.drawMoney(100, mode);
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
