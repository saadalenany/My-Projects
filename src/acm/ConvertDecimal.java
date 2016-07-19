package acm;
public class ConvertDecimal {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int x ;
        do{
            System.out.println("enter positive number");
            x = input.nextInt();
        }while(x<0);
        System.out.println("Binary number is ");
        Binary(x);
        System.out.println();
        System.out.println("Octal number is ");
        Octal(x);
        System.out.println();
        System.out.println("Hexdecimal number is ");
        HexaDecimal(x);
        System.out.println();
    }
    public static void Binary(int x) {
        int r ;
        if(x<1){
            return ;
        }
        r = x % 2 ;
        Binary(x/2);
        System.out.print(r);
    }
    public static void Octal(int x){
        int r ;
        if(x<1){
            return ;
        }
        r = x % 8;
        Octal(x/8);
        System.out.print(r);
    }
    public static void HexaDecimal(int x){
        String r ;
        if(x<1){
            return ;
        }
        r = (x % 16) + "" ;
        switch(r){
            case 10+"":
                r = "A";
                break;
            case 11+"":
                r = "B";
                break;
            case 12+"":
                r = "C";
                break;
            case 13+"":
                r = "D";
                break;
            case 14+"":
                r = "E";
                break;
            case 15+"":
                r = "F";
                break;
            default:
                break;
        }
        HexaDecimal(x/16);
        System.out.print(r);
    }
}
