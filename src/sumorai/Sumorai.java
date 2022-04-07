/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumorai;

/**
 *
 * @author admin
 */
public class Sumorai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputProfile();// TODO code application logic here
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("\t\tNhập Dữ Liệu Thông tin");
        System.out.print("Họ tên:");
        name = sc.nextLine().toUpperCase();

        //yob = sc.nextInt();
        // xóa bộ nhớ đệm 
        // nghiệp dư  sc.nextLine();
        // JVM chừa cho mình một cơ chế
        // if mày biết câu lệnh văng miếng, nguy hiểm, bom nổ, nhốt lại, cho SANDBOX 
        // NẾU CÓ BIẾN THÌ ĐỪNG GIẾT VÀO BÁO CHO TÔI BIÊT TRY CAT 
        while (true) {

            try {
                System.out.print("Tuổi:");
                yob = Integer.parseInt(sc.nextLine());// có nguy cơ bị lỗi rất cao 
                break;
// câu lệnh văng miếng dữ nó lại
            } catch (Exception e) {
                // miếng văng vào đây, khi có chuyện ...
                // CPU đi vô đây, ko diệt app nữa 
                // thường mình sẽ chửi, srt deafault, bắt nhập lại 
                // Exception e = new Exception diễn da điều gì 
                //yob = 79;
                System.out.println("Nhập sai thông tin");
            }
        }
        System.out.print("Địa chỉ:");
        address = sc.nextLine().toUpperCase();
        // xóa bộ nhớ đệm 
        System.out.println("\n\t\t****Tên:  " + name);
        System.out.println("\t\t****Tuổi: " + yob);
        System.out.println("\t\tAnĐịa chỉ: " + address);
        // Math.

    }
}
