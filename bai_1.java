
import java.util.Scanner;

public class bai_1 {
    // Phần a
    private double x;
    private double y;
    bai_1(){
        
    }
    
    // phần b
    void setX(double x){
        this.x = x;
    }
    double getX(){
        return x;
    }
    void setY(double y){
        this.y = y;
    }
    double getY(){
        return y;
    }
    
    static void nhap_vao_3_diem(bai_1 thu1,bai_1 thu2, bai_1 thu3){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap vao toa do x thu 1: ");
            thu1.setX(sc.nextDouble());
            System.out.print("Nhap vao toa do y thu 1: ");
            thu1.setY(sc.nextDouble());
            
            System.out.print("Nhap vao toa do x thu 2: ");
            thu2.setX(sc.nextDouble());
            System.out.print("Nhap vao toa do y thu 2: ");
            thu2.setY(sc.nextDouble());
            
            System.out.print("Nhap vao toa do x thu 3: ");
            thu3.setX(sc.nextDouble());
            System.out.print("Nhap vao toa do y thu 3: ");
            thu3.setY(sc.nextDouble());
        }
    }
    
    static double dodai_canh1_canh2(bai_1 thu1,bai_1 thu2){
        return Math.sqrt( ((thu2.x-thu1.x)*(thu2.x-thu1.x)) + ((thu2.y-thu1.y)*(thu2.y-thu1.y)) );
    }
    
    static double dodai_canh1_canh3(bai_1 thu1, bai_1 thu3){
        return Math.sqrt( ((thu3.x-thu1.x)*(thu3.x-thu1.x)) + ((thu3.y-thu1.y)*(thu3.y-thu1.y)) );
    }
    
    static double dodai_canh2_canh3(bai_1 thu2, bai_1 thu3){
        return Math.sqrt( ((thu2.x-thu3.x)*(thu2.x-thu3.x)) + ((thu2.y-thu3.y)*(thu2.y-thu3.y)) );
    }
    
    static int kiemtra_thanghang(double a,double b,double c){
        if(a + b > c || a + c > b || b + c > a) return 0;
        else return 1;
    }
    
    static double chuvi(double a,double b,double c){
        return a + b + c;
    }
    
    static double dientich(double a,double b,double c){
        return ( 0.25 * Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(c + a - b)) );
    }
    
    public static void main(String[] args){
        System.out.println("c: Kiem tra 3 diem xem co thang hang hay khong?");
        System.out.println("d: Tinh khoang cach giua 2 diem");
        System.out.println("e: Tinh chu vi va dien tich cua tam giac");
        System.out.println("Nhap vao 3 diem co toa do: ");
    //khai báo 3 điểm
        bai_1 thu1 = new bai_1();
        bai_1 thu2 = new bai_1();
        bai_1 thu3 = new bai_1();
    //nhập vào tọa độ 3 điểm
        nhap_vao_3_diem(thu1,thu2,thu3);
        double a = dodai_canh1_canh2(thu1,thu2);
        double b = dodai_canh1_canh3(thu1,thu3);
        double c = dodai_canh2_canh3(thu2,thu3);
        int check = kiemtra_thanghang(a,b,c);
        if(check == 1) System.out.println("3 diem thang hang");
        else if (check == 0) System.out.println("3 diem khong thang hang");
        
        System.out.println( "Khoang cach giua 2 diem thu 1 va thu 2: " + a );
        System.out.println( "Khoang cach giua 2 diem thu 1 va thu 3: " + b );
        System.out.println( "Khoang cach giua 2 diem thu 2 va thu 3: " + c );
        
        if(check == 0){
            System.out.println("Chu vi cua tam giac la: " + chuvi(a,b,c));
            System.out.println("Dien tich cua tam giac la: " + dientich(a,b,c));
        }
    }
}