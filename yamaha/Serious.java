package motor.yamaha;

import motor.Motor;

import java.util.Scanner;

public class Serious extends Motor {
    private int warranty;

    public int getWarranty() {
        return warranty;
    }

    @Override
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);

        super.inputInfor();
        System.out.println("Nhập thời gian bảo hành xe Serious:");
        warranty = Integer.parseInt(sc.nextLine());

    }
    @Override
    public void displayInfor(){
        super.displayInfor();
        System.out.println("thời gian bảo hành của Serious:" + warranty);
    }
}
