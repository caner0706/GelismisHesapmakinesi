import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1- Toplama İşlemi \n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdötgen Alan ve Çevre Hesabı\n"
                + "9- Çıkış Yap");
        
        
        
        boolean kontrol = true;
        
        while(kontrol){
            
            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçin : ");
            int secim = scanner.nextInt();
            
            
            
            if(secim == 1){
                //Toplama
                toplama();
            }
            
            else if(secim == 2){
                //Çıkarma
                cıkarma();
            }
            
            else if(secim == 3){
                //Çarpma
                carpma();
            }
            
            else if(secim == 4){
                //Bölme
                bolme();
            }
            
            else if(secim ==5){
                //Üslü Sayı
                usluSayı();
            } 
            
            else if(secim == 6){
                //Faktoriyel
                faktoriyel();
            }
            
            else if(secim == 7){
                //Mod Alma
                mod();
            }
            
            else if(secim == 8){
                //Dikdörtgen
                dikdortgen();
            }
            
            else if(secim == 9){
                //Çıkış
                System.out.println("Çıkış Yapılıyor...");
                kontrol = false;
                break;
            }
            
            else{
                //Geçersiz Seçim
                System.out.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyin.");
            }
            
                        
        }

    }
    
    
    
    
    
    
    
    public static void toplama(){
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Birinci Değeri Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Değeri Girin : ");
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 + sayi2;
        System.out.println("Sonuç : " + sonuc);
        
    }
    
    
    
    public static void cıkarma(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Birinci Değeri Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Değeri Girin : ");
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 - sayi2;
        System.out.println("Sonuç : " + sonuc);
        
    }
    
    
    
    
    public static void carpma(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Birinci Değeri Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Değeri Girin : ");
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 * sayi2;
        System.out.println("Sonuç : " + sonuc);
        
    }
    
    
    
    
    public static void bolme(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Birinci Değeri Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Değeri Girin : ");
        double sayi2 = scanner.nextDouble();
        double sonuc = sayi1 / sayi2;
        System.out.println("Sonuç : " + sonuc);
    }
    
    
    
    public static void usluSayı(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Taban Değerini Girin : ");
        double taban = scanner.nextDouble();
        System.out.print("Lütfen Üs Değerini Girin : ");
        double üs = scanner.nextDouble();
        double sonuc = Math.pow(taban, üs);
        System.out.println("Sonuç : " + sonuc);
    }
    
    
    
    
    public static void faktoriyel(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Hesaplamak İstediğiniz Faktoriyel Sayısını Girin : ");
        int sayi = scanner.nextInt();
        
        int sonuc = 1;
        for(int i = 1;i<=sayi;i++){
            sonuc = (sonuc * i);
        }
        
        System.out.println("Sonuç : " + sonuc );
        
    }
    
    
    
    
    public static void mod(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Modunu Hesaplamak İstediğiniz Sayıyı Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen Hesaplamak İstediğniz mod Değerini Girin : ");
        double sayi2 = scanner.nextDouble();
        
        double sonuc = sayi1 % sayi2;
        
        System.out.println("Sonuç : " + sonuc);
    }
    
    
    
    public static void dikdortgen(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Birinci Kenarı Girin : ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Kenarı Girin : ");
        double kenar2 = scanner.nextDouble();
        
        double alan = kenar1 * kenar2;
        double cevre = (kenar1 + kenar2) * 2;
        
        System.out.println("Çevre : " + cevre + " Alan : " + alan);
    }
    
    
    
    
    
}

