package Content;

import java.util.Scanner;

public class Student extends Person {



        private String maSV;
        private double diemThi;
        private String email;


        public Student() {
        }


        public Student(String ten, String gioiTinh, String ngaySinh, String diaChi,
                       String maSV, double diemThi, String email) {
            super(ten, gioiTinh, ngaySinh, diaChi);
            this.maSV = maSV;
            this.diemThi = diemThi;
            this.email = email;
        }


        @Override
        public void nhapThongTin() {

            super.nhapThongTin();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã sinh viên: ");
            this.maSV = scanner.nextLine();
            System.out.print("Nhập điểm thi: ");
            this.diemThi = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line
            System.out.print("Nhập email: ");
            this.email = scanner.nextLine();
        }


        @Override
        public void inThongTin() {
            super.inThongTin();
            System.out.println("Mã sinh viên: " + maSV);
            System.out.println("Điểm thi: " + diemThi);
            System.out.println("Email: " + email);
        }


        public boolean coHocBong() {
            return diemThi > 8.0;
        }
    }



