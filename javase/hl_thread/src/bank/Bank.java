package bank;

import java.util.Objects;

/**
 * @Auther: Administrator
 * @Date: 2019/7/9 11:10
 * @Description:
 */
public class Bank {
    static double money = 5000;

    //柜台取钱
    private void counter(double money){
        Bank.money -= money;
        System.out.println("柜台取钱" + money + "元，还剩" +Bank.money + "元！");
    }

    //ATM取钱
    private void ATM(double money){
        Bank.money -= money;
        System.out.println("ATM取钱" + money + "元，还剩" +Bank.money + "元！");
    }

    //提供一个对外取款途径，防止直接调取方法同时取款，并发显示余额错误
    public synchronized void drawMoney(double money, String mode) throws Exception{
        if(money > Bank.money){
            throw new Exception("取款金额"+money+",余额只剩"+Bank.money+"，取款失败");
        }
        if(Objects.equals(mode, "ATM")){
            ATM(money);
        } else {
            counter(money);
        }
    }

    public static void main(String[] args) {
        System.out.println("哈哈");
    }
}
