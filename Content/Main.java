package Content;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Nhập thông tin cho Person:");
        person.nhapThongTin();
        System.out.println("Thông tin của Person:");
        person.inThongTin();
        System.out.println();


        Student student = new Student();
        System.out.println("Nhập thông tin cho Student:");
        student.nhapThongTin();
        System.out.println("Thông tin của Student:");
        student.inThongTin();

        
        if (student.coHocBong()) {
            System.out.println("Sinh viên có được học bổng.");
        } else {
            System.out.println("Sinh viên không được học bổng.");
        }
    }
}
