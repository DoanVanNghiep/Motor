package motor.yamaha;

import motor.Motor;

import java.util.*;

public class Yamaha {
    private static List<Motor> motors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        do {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Lựa chọn của bạn:");
            x = sc.nextInt();
            switch (x){
                case 1:
                    inputInfor(motors);
                    System.out.println("Nhập thông tin thành công.");
                    break;
                case 2:
                    display(motors);
                    break;
                case 3:
                    sortByWarranty(motors);
                    break;
                case 4:
                    searchBySerious(motors);
                    break;
                case 5:
                    System.out.println(" Exit successfully!");
                    break;
                default:
                    System.out.println(" Lựa chọn của bạn không có. Xin nhap lai!");
                    break;
            }
        }while (x!=5);
        sc.close();
    }
    static void inputInfor(List<Motor> motors){

        System.out.println("Nhập thông tin 3 xe Jupiter:");
        for (int i = 0; i < 3; i++) {
            Jupiter jupiter = new Jupiter();
            jupiter.inputInfor();
            motors.add(jupiter);
        }

        System.out.println("Nhập thông tin 3 xe Serious:");
        for (int i = 0; i < 3; i++) {
            Serious serious = new Serious();
            serious.inputInfor();
            motors.add(serious);
        }
    }
    static void sortByWarranty(List<Motor> motors){
        System.out.println("Trước khi sắp xếp:");
        motors.forEach(Motor :: displayInfor);
        System.out.println("Sau khi sắp xếp theo thời gian bảo hành:");
        Collections.sort(motors, (x,y) -> {
            int warrantyX = 0;
            int warrantyY = 0;
            if(x instanceof Jupiter){
                Jupiter jupiter = (Jupiter) x;
                warrantyX = jupiter.getWarranty();
            }else {
                Serious serious = (Serious) x;
                warrantyX = serious.getWarranty();
            }
            if(y instanceof Jupiter){
                Jupiter jupiter = (Jupiter) y;
                warrantyY = jupiter.getWarranty();
            }else {
                Serious serious = (Serious) y;
                warrantyY = serious.getWarranty();
            }
            return warrantyX - warrantyY;

        });
        motors.forEach(Motor :: displayInfor);
    }
    static void searchBySerious(List<Motor> motors){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Serious cần tìm kiếm:");
        String searchSerious = sc.nextLine();

        boolean search = false;
        for (int i = 0; i < motors.size(); i++) {
            if(motors.get(i).getName().equals(searchSerious)){
                search = true;
                motors.get(i).displayInfor();
                break;
            }
        }
        if(search=false) System.out.println("không tìm thấy tên Serious tương ứng.");
    }
    static void display(List<Motor> motors){
        for (int i = 0; i < motors.size(); i++) {
            motors.get(i).displayInfor();
        }

    }
}
