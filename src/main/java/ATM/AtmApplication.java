package ATM;

import java.util.Scanner;

public class AtmApplication {
    public static void main(String[] args) {

        /* enes bayram iban TR12 0000 0006 7833 7346 3643 08
        enesin kullanici adi enes123 enesin sifresi 4566
        toplam hesaptaki para= 2600

        bilal camur iban TR23 0000 0006 4355 5677 3453 65
        bilalin kullanuici adi
         sifreai 7899
         toplam hesapteki para= 2500

        bakiye goruntukeme icin 1
        para cekmek icini 2
        farkli bir hesaba para yatrimak icin 3
        uygulamadan cikmak icin 3

         */


        System.out.println("ATM'ye hosgeldiniz"+"\nlutfen giris bilgilerinizi giriniz");

        double bilalbakiye= 2500;
        String bilaliban="TR23 0000 0006 4355 5677 3453 65";
        String bilalkullaniciadi="bilal123";
        String bilalsifre="7899";

        double enesbakiye= 2600;
        String enesiban="TTR12 0000 0006 7833 7346 3643 08";
        String eneskullaniciadi="enes123";
        String enessifre="4566";

        String islemsecenekleri= "bakiye goruntuleme--> 1"+
                "\npara cekme--> 2"+
                "\npara yatrima--> 3"+
                "\nfarkli hesaba para yatirma--> 4"+
                "\ncikis icin q tusuna basiniz";


        System.out.print("kullaniciadi =");
        Scanner scanner= new Scanner(System.in);
        String kullaniciadi= scanner.nextLine();

        System.out.print("sifre =");
        String sife=scanner.nextLine();

        if (kullaniciadi.equals(bilalkullaniciadi)  && (sife.equals(bilalsifre)))
        {
            System.out.println("sayin bilal camur hosgeldiniz" + "\nyapmak istediginiz islemi seciniz");
            System.out.println("islemleriniz = " + islemsecenekleri);
            byte islem = scanner.nextByte();
            System.out.println("isleminiz = " + islem);


            switch (islem)
            {
                case 1:
                    System.out.println("bakiye goruntuleme");
                    System.out.println("bakiyeniz = " + bilalbakiye);
                    break;
                case 2:
                    System.out.println("para cekme");
                    System.out.println("cekmek istediginiz miktari giriniz");
                    double cekilecekmiktar= scanner.nextDouble();
                    double kalanmiktar =(cekilecekmiktar - bilalbakiye);
                    System.out.println("kalan bakiyeniz = " + kalanmiktar);
                    break;
                case 3:
                    System.out.println("para yatirma");
                    System.out.println("lutfen yatirmak istediginiz miktari giriniz");
                    double yatirilanpa= scanner.nextDouble();
                    double toplampara= (yatirilanpa+bilalbakiye);
                    System.out.println("toplam bakiyeniz ="+toplampara);

                    break;

                case 4:
                    System.out.println("farkli hesaba para yatirma");
                    System.out.println("lutfen yatirmak istediginiz hesabin ibanini yazinir"+"\niban =");
                    int yatirilacakiban= scanner.nextInt();
                    System.out.println("yatirmak istediginiz miktari giriniz"+"\n= ");
                    scanner.next();
                    double yatacakparamiktari= scanner.nextDouble();
                    scanner.next();
                    // double yatacakparamiktari= scanner.nextDouble();

                    double toplam=(yatacakparamiktari+enesbakiye);

                    double kalanpara=(bilalbakiye-yatacakparamiktari);

                    System.out.println("kalan paraniz = " + kalanpara);

                    break;

                case 5:
                    System.out.println("cikis icin q tusuna basiniz");
                default:
                    System.out.println("bilgileriniz yanlis lutfen tekrar deneyiniz");

            }
        }
        else if (kullaniciadi.equals(eneskullaniciadi)&& (sife.equals(enessifre)))
        {
            System.out.println("sayin enes bayram hosgeldiniz" + "\nyapmak istediginiz islemi seciniz");
            System.out.println("islemleriniz = " + islemsecenekleri);
            byte islem = scanner.nextByte();
            System.out.println("isleminiz = " + islem);

        }
    }

}
