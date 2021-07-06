package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        QLSP qlsp= new QLSP();

        while (true){
        System.out.println("-----CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
        System.out.println("Chọn chức năng theo số để tiếc tục");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi từ file");
        System.out.println("9. Thoát");

        int choise=scanner.nextInt();

        switch (choise){
            case 1:
                qlsp.show();
                break;
            case 2:
                System.out.println("Nhập tên sản phẩm muốn thêm");
                qlsp.addSanPham();
                break;
            case 3:
                System.out.println("Cập nhật sẽ xóa dữ liệu cũ bạn đồng ý chứ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int choise2=Integer.parseInt(scanner.nextLine());
                if(choise2==1){
                    System.out.println("Nhập vào vị trí sản phẩm muốn thay đổi");
                    int index=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên sản phẩm mới");
                    String ten=scanner.nextLine();
                }else
                    System.out.println("Không thể update");
                break;
            case 4:
                System.out.println("Dữ liệu cũ sẽ bị mất khi xóa bạn đồng ý không");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int choise3=Integer.parseInt(scanner.nextLine());
                if(choise3==1){
                    System.out.println("Nhập vào mã sản phẩm muốn xóa"+"tôi là chung ngơ tôi là đệ của em trai đoàn hữu tám");
                    String id=scanner.nextLine();
                    qlsp.remove(id);
                }else if(choise3==2){
                    System.out.println("KHông thể xóa");
                }else {
                    System.out.println("Nhập lại");
                }
                break;
            case 5:
                qlsp.sort();
                break;
            case 6:
                qlsp.FindMax();
                break;
            case 7:
                qlsp.docFile();
                break;
            case 8:
                qlsp.ghiFile();
                break;
            case 9:
                System.exit(0);
        }



        }
    }
}
