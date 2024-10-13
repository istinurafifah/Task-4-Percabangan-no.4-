import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int seratusRibu , limaPuluhRibu , duaPuluhRibu , sepuluhRibu , limaRibu , duaRibu , seribu , limaRatus , seratus;
        Scanner input = new Scanner(System.in);
    
        int uangMasuk = input.nextInt();
        System.out.println("Uang Masuk = Rp." +uangMasuk);

        if (uangMasuk >= 100000) {
            seratusRibu = uangMasuk / 100000;
            uangMasuk = uangMasuk % 100000;
            System.out.println( seratusRibu + " lembar 100.000 rupiah" );
        
        } 
        
        if (uangMasuk >= 50000) {
            limaPuluhRibu = uangMasuk / 50000;
            uangMasuk = uangMasuk % 50000;
            System.out.println( limaPuluhRibu + " lembar 50.000 rupiah" );
        }

        if (uangMasuk >= 20000) {
            duaPuluhRibu = uangMasuk / 20000;
            uangMasuk = uangMasuk % 20000;
            System.out.println( duaPuluhRibu + " lembar 20.000 rupiah");
            
        }
        
        if (uangMasuk >= 10000) {
            sepuluhRibu = uangMasuk / 10000;
            uangMasuk = uangMasuk % 10000;
            System.out.println( sepuluhRibu + " lembar 10.000 rupiah");
         
        }    
           
        if (uangMasuk >= 5000) {
            limaRibu = uangMasuk / 5000;
            uangMasuk = uangMasuk % 5000;
            System.out.println( limaRibu + " lembar 5.000 rupiah");

        }
                
        if (uangMasuk >= 2000) {
            duaRibu = uangMasuk / 2000;
            uangMasuk = uangMasuk % 20000;
            System.out.println( duaRibu + " lembar 2.000 rupiah");
        
        }
        
        if (uangMasuk >= 1000) {
            seribu = uangMasuk / 1000;
            uangMasuk = uangMasuk % 1000;
            System.out.println( seribu + " lembar 1.000 rupiah");
        }
        
        if (uangMasuk >= 500) {
            limaRatus = uangMasuk / 500;
            uangMasuk = uangMasuk % 500;
            System.out.println( limaRatus + " lembar 500 rupiah");
        }

        if (uangMasuk >= 100) {
            seratus = uangMasuk / 100;
            uangMasuk = uangMasuk % 100;
            System.out.println( seratus + " lembar 100 rupiah");
        }

        input.close();
    }
}
