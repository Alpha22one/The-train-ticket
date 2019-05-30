package tiketKereta;

import java.util.Scanner;

public class mainMain {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Kereta a = new Kereta ("Gajahyana 13");
        
        a.setKel(new Kelas("Ekonomi"));
        a.setKel(new Kelas("Bisnis"));
        a.setKel(new Kelas("Eksekutif"));
        
        
        System.out.println("--------------- TIKET KERETA ---------------");
        System.out.println(" ");
        System.out.println("TUJUAN");
        System.out.println("1. Malang - Yogyakarta");
        System.out.println("2. Malang - Bandung");
        System.out.println("3. Malang - Jakarta");
        System.out.print("Pilih tujuan : ");
        int intu=in.nextInt ();
        int countertu=intu-1;
        
        System.out.println(" ");
        System.out.println("KELAS");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. Eksekutif");
        System.out.print("Pilih kelas : ");
        int inkel=in.nextInt ();
        int counterkel=inkel-1;
        
        a.getKel(counterkel).setTu(new Tujuan("Malang - Yogyakarta"));
        a.getKel(counterkel).setTu(new Tujuan("Malang - Bandung"));
        a.getKel(counterkel).setTu(new Tujuan("Malang - Jakarta"));
        
        int counterti=0;
        if((inkel==1)&&(intu==1)){
            counterti=+0;
        }
        if((inkel==2)&&(intu==1)){
            counterti=+1;
        }
        if((inkel==3)&&(intu==1)){
            counterti=+2;
        }
        if((inkel==1)&&(intu==2)){
            counterti=+3;
        }
        if((inkel==2)&&(intu==2)){
            counterti=+4;
        }
        if((inkel==3)&&(intu==2)){
            counterti=+5;
        }
        if((inkel==1)&&(intu==3)){
            counterti=+6;
        }
        if((inkel==2)&&(intu==3)){
            counterti=+7;
        }
        if((inkel==3)&&(intu==3)){
            counterti=+8;
        }
        
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(200000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(240000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(300000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(310000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(350000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(400000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(410000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(450000));
        a.getKel(counterkel).getTu(countertu).setTi(new Tiket(500000));
        
        System.out.println(" ");
        System.out.println("================ SLIP BAYAR ================");
        System.out.println("=============== TIKET KERETA ===============");
        System.out.println("Kereta              : "+a.getNama());
        System.out.println("Tujuan              : "+a.getKel(counterkel).getTu(countertu).getNama());
        System.out.println("Kelas               : "+a.getKel(counterkel).getNama());
        System.out.println("Harga tiket         : "+a.getKel(counterkel).getTu(countertu).getTi(counterti).getHarga());
        System.out.print("Jumlah pemesanan    : ");
        int inor=in.nextInt ();
        System.out.println("Total harga         : "+a.getKel(counterkel).getTu(countertu).getTi(counterti).hartik(inor));
        
    }
}
