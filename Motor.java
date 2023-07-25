package motor;

import java.util.Scanner;

public class Motor implements IMotor {

    private String code;
    private String name;
    private double capacity;
    private int num;

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getNum() {
        return num;
    }

    public Motor() {
    }

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin:");
        System.out.print("Mã xe:");
        code = sc.nextLine();

        System.out.print("Tên loại xe:");
        name = sc.nextLine();

        System.out.print("Dung tích xi lanh:");
        capacity = Double.parseDouble(sc.nextLine());

        System.out.print("Kiểu truyền lực:");
        num = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfor() {
        System.out.println("Motor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num=" + num +
                '}');
    }

    @Override
    public void changeInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin:");
        System.out.print("Mã xe:");
        code = sc.nextLine();

        System.out.print("Tên loại xe:");
        name = sc.nextLine();

        System.out.print("Dung tích xi lanh:");
        capacity = Double.parseDouble(sc.nextLine());

        System.out.print("Kiểu truyền lực:");
        num = Integer.parseInt(sc.nextLine());
    }
}
