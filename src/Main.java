import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Nhập xuất:
//   1     System.out.println("Hello world");

//   2     System.out.println("Hello world, Hi Ae");

//   3    Scanner input = new Scanner(System.in);
//        System.out.println("Nhập tên: ");
//        String a = input.nextLine();
//        System.out.println("Hello C06");


//        Kiểu dữ liệu:
//    1    int a= 5;
//        System.out.println(a);

//    2    Scanner input = new Scanner(System.in);
//        System.out.println("Nhập một số : ");
//        int a= input.nextInt();
//        System.out.println("Số bạn vừa nhập là: " + a);


//    3    Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số đầu tiên: ");
//        int a = inputNumber.nextInt();
//        System.out.println("Nhập số thứ hai: ");
//        int b = inputNumber.nextInt();
//        System.out.println("Tổng của hai số vừa nhập là: "+ (a + b) );
//        System.out.println("Tích của hai số vừa nhập là: "+ (a * b) );
//        System.out.println("Thương của hai số vừa nhập là: "+ (a / b) );
//        System.out.println("Hiệu của hai số vừa nhập là: "+ (a - b) );
//        System.out.println("Chia số dư của hai số vừa nhập là: "+ (a % b) );

//    4    Scanner inputInfo = new Scanner(System.in);
//        System.out.println("Nhập tên: ");
//        String name = inputInfo.nextLine();
//        System.out.println("Nhập tuổi: ");
//        int age = inputInfo.nextInt();
//        System.out.println("Xin chào "+ name +", tôi năm nay "+ age +" tuổi. ");

//        Toán tử
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số đầu tiên: ");
//        int a = inputNumber.nextInt();
//        System.out.println("Nhập số thứ hai: ");
//        int b = inputNumber.nextInt();
//        System.out.println(a);
//        System.out.println(b);



//        Điều kiện
//Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = inputNumber.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = inputNumber.nextInt();
//        if ( a%b ==0 ){
//            System.out.println("Số a chia hết cho số b");
//        }else {
//            System.out.println("Số a không chia hết cho số b");
//        }

//        Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập tuổi: ");
//        int age = input.nextInt();
//        if(age <16){
//            System.out.println("Không đủ điều kiện vào học lớp 10");
//        }else {
//            System.out.println("Đủ điều kiện vào học lớp 10");
//        }


//        Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập một số bất kì: ");
//        int a = inputNumber.nextInt();
//        if(a>0){
//            System.out.println("Số bạn vừa nhập lớn hơn số 0");
//        }else if( a==0){
//            System.out.println("Số bạn vừa nhập là số 0");
//        }else {
//            System.out.println("Số bạn vừa nhập bé hơn số 0");
//        }


//        Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = inputNumber.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = inputNumber.nextInt();
//        System.out.println("Nhập số c: ");
//        int c = inputNumber.nextInt();
//        if( a>b && a>c){
//            System.out.println("Số lớn nhất là số: "+ a);
//        }else if (b>c){
//            System.out.println("Số lớn nhất là số: "+ b);
//        }else {
//            System.out.println("Số lớn nhất là số: "+ c);
//        }


//        Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner inputDiem = new Scanner(System.in);
//        System.out.println("Nhập điểm bài kiểm tra :");
//        int a = inputDiem.nextInt();
//        System.out.println("Nhập điểm thi giữa kỳ:");
//        int b = inputDiem.nextInt();
//        System.out.println("Nhập điểm thi cuối kỳ :");
//        int c = inputDiem.nextInt();
//        int d = (a+b+c)/3;
//        if( d>=8){
//            System.out.println("Học sinh giỏi");
//        }else if( d>=6 && d<8){
//            System.out.println("Học sinh khá");
//        }else {
//            System.out.println("Học sinh trung bình");
//        }


//        Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner inputSold = new Scanner(System.in);
//        System.out.println("Nhập số hàng đã bán được: ");
//        int a = inputSold.nextInt();
//        int b= (a*20000*10)/100;
//        System.out.println("Hoa hồng nhận được : "+ b + "VNĐ");


//        Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho. 1000VNĐ/60s
//        Scanner inputSold = new Scanner(System.in);
//        System.out.println("Tổng số giây đã dùng : ");
//        int a = inputSold.nextInt();
//        int b= a*1000;
//        System.out.println("Tiền cước điện thoại : "+ b + "VNĐ");

//        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ C: ");
//        double a = input.nextDouble();
//        double b = (a*9)/5 +32;
//        System.out.println( a+" Độ C" +"="+ b +" Độ F");


//        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ dài mét : ");
//        double a = input.nextDouble();
//        double b = a* 3.2808;
//        System.out.println( a+"mét" +"="+ b +"feet");


//        Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ dài cạnh hình vuông : ");
//        double a = input.nextDouble();
//        double b = a*a;
//        System.out.println("Diện tích hình vuông là :" + b);


//        Bài 4: Tính diện tích hình chữ nhật khi biết 02 cạnh a, b.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        double a = inputNumber.nextDouble();
//        System.out.println("Nhập cạnh b: ");
//        double b = inputNumber.nextDouble();
//        double S= a*b;
//        System.out.println("Diện tích hình chữ nhật là : "+ S);


//        Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        double a = inputNumber.nextDouble();
//        System.out.println("Nhập cạnh b: ");
//        double b = inputNumber.nextDouble();
//        double S= (a*b)/2;
//        System.out.println("Diện tích tam giác vuông là : "+ S);


//        Bài 6: Giải phương trình bậc 1.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        double a = inputNumber.nextDouble();
//        System.out.println("Nhập số b: ");
//        double b = inputNumber.nextDouble();
//        double c= -b/a;
////        if(a==0 && b==0){
////            System.out.println("Phương trình vô số nghiệm");
////        }else if (a==0 && b!=0){
////            System.out.println("Phương trình vô nghiệm");
////        }else {
////            System.out.println("Phương trình có nghiệm là :" +c);
////        }
//        if (a!=0){
//            System.out.println("Phương trình có nghiệm là :"+c);
//        }else {
//            if(b==0){
//                System.out.println("Phương trình vô nghiệm");
//            }else {
//                System.out.println("Phương trình vô số nghiệm");
//            }
//        }


//        Bài 7: Giải phương trình bậc 2.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        double a = inputNumber.nextDouble();
//        System.out.println("Nhập số b: ");
//        double b = inputNumber.nextDouble();
//        System.out.println("Nhập số c: ");
//        double c = inputNumber.nextDouble();
//        double Denta = (b*b - 4*a*c);
//        double CanBacHaiDenta = Math.sqrt(Denta);
//        double x1=((-b)+CanBacHaiDenta)/(2*a);
//        double x2=((-b)-CanBacHaiDenta)/(2*a);
//        if(Denta<0 ){
//            System.out.println("Phương trình vô nghiệm");
//        }else if(Denta==0){
//            System.out.println("Phương trình có nghiệm kép x1=x2="+ (-b/2*a));
//        }else if(Denta>0){
//            System.out.println("Phương trình có 2 nghiệm phân biệt là: "+x1 +" và " + x2);
//        }


//        Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner inputSold = new Scanner(System.in);
//        System.out.println("Nhập số tuổi: ");
//        int a = inputSold.nextInt();
//        if( a>0 && a<120){
//            System.out.println("Số tuổi của người đó là :" + a);
//        }else {
//            System.out.println("Số tuổi nhập vào không phải là của con người");
//        }


//        Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//        a,b,c > 0
//        a + b > c
//        b + c > a
//        a + c > b
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        double a = inputNumber.nextDouble();
//        System.out.println("Nhập cạnh b: ");
//        double b = inputNumber.nextDouble();
//        System.out.println("Nhập cạnh c: ");
//        double c = inputNumber.nextDouble();
//        if(a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b){
//            System.out.println("Đó là ba cạnh của một tam giác");
//        }else {
//            System.out.println("Đó không phải là ba cạnh của một tam giác");
//        }


//        Bài 10: Viết chương trình tính giá điện.
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập tổng số kWh trong 30 ngày : ");
//        double a = inputNumber.nextDouble();
//        if(a<=50){
//            System.out.println("Tiền điện: "+(a*1.728)+"VNĐ");
//        }else if(a>=51 && a<=100){
//            System.out.println("Tiền điện: "+(a*1.786)+"VNĐ");
//        }else if(a>=101 && a<=200){
//            System.out.println("Tiền điện: "+(a*2.014)+"VNĐ");
//        }else if(a>=201 && a<=300){
//            System.out.println("Tiền điện: "+(a*2.615)+"VNĐ");
//        }
    }
}