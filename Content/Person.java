package Content;
import java.util.Scanner;
public class Person {



        private String ten;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;


        public Person() {
        }


        public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
        }

        // Getter và setter
        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }


        public void nhapThongTin() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên: ");
            this.ten = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            this.gioiTinh = scanner.nextLine();
            System.out.print("Nhập ngày sinh: ");
            this.ngaySinh = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            this.diaChi = scanner.nextLine();
        }


        public void inThongTin() {
            System.out.println("Tên: " + ten);
            System.out.println("Giới tính: " + gioiTinh);
            System.out.println("Ngày sinh: " + ngaySinh);
            System.out.println("Địa chỉ: " + diaChi);
        }
    }


