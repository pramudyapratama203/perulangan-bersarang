
package programkasir;

import java.util.Scanner;

public class perulanganbersarang {
    public static void main(String[] args) {
        //Deklarasi
        Scanner input = new Scanner(System.in);
        int pilih1 = 0, pilih2 =0, pilih3 = 0, pilih4 = 0, jumlah = 0, 
                hargaSandal = 25000, hargaSepatu = 300000, hargaTas = 100000,
                harga = 0, ubahHarga = 0, hargaTotal = 0;
        
        do {
            System.out.println("\nSelamat datang di program kasir");
            System.out.println("1. Kasir\n2. Admin\n3. Owner\n4. Exit");
            System.out.print("Silahkan pilih role : "); pilih1=input.nextInt();
            
            switch(pilih1){
                case 1 :
                    do {
                      System.out.println("\nSelamat datang role kasir");
                      System.out.println("1. Sandal\n2. Sepatu\n3. Tas\n4. Selesai");
                      System.out.print("Silahkan pilih barang yang ingin dibeli : "); pilih2=input.nextInt();
                    
                        switch (pilih2){
                        case 1 :
                        System.out.println("\nSandal Rp. " + hargaSandal);
                        System.out.print("Jumlah sandal yang ingin dibeli : "); jumlah=input.nextInt();
                        harga = hargaSandal * jumlah;
                        hargaTotal = hargaTotal + harga;
                        System.out.println("Harga yang didapat adalah " + harga);
                        break;
                        
                        case 2 : 
                        System.out.println("\nSepatu Rp. " + hargaSepatu);
                        System.out.print("Jumlah sepatu yang ingin dbeli: "); jumlah=input.nextInt();
                        harga = hargaSepatu * jumlah;
                        hargaTotal = hargaTotal + harga;
                        System.out.println("Harga yang didapat adalah " + harga);
                        break;
                    
                        case 3 :
                        System.out.println("\nTas Rp. " + hargaTas);
                        System.out.print("Jumlah tas yang ingin dibeli: " ); jumlah=input.nextInt();
                        harga = hargaTas * jumlah;
                        hargaTotal = hargaTotal + harga;
                        System.out.println("Harga yang didapat adalah " + harga);
                        break;
                        
                        case 4 :
                        System.out.println("\nHarga total yang didapat adalah " + hargaTotal);
                        System.out.println("Terima kasih sudah membeli produk");
                        break;
                    
                        default :
                        System.out.println("\nPilihan anda tidak ada");
                        break;
                       } 
                    } while (pilih2!=4);
                    break;
                 
                case 2 : 
                    do{
                        System.out.println("\nSelamat datang role Admin");
                        System.out.println("1. Sandal Rp. " + hargaSandal);
                        System.out.println("2. Sepatu Rp. " + hargaSepatu);
                        System.out.println("3. Tas Rp. " + hargaTas);
                        System.out.println("4. Selesai");
                        System.out.print("Pilih barang yang ingin diubah harganya : "); pilih3=input.nextInt();
                        
                        switch (pilih3){
                            case 1 : 
                                System.out.println("\nSandal Rp. " + hargaSandal);
                                System.out.print("Ubah harga menjadi : "); ubahHarga=input.nextInt();
                                hargaSandal = ubahHarga;
                                System.out.println("Harga sandal berhasil diubah menjadi " + hargaSandal);
                                break;
                                
                            case 2 : 
                                System.out.println("\nSepatu Rp. " + hargaSepatu);
                                System.out.print("Ubah harga menjadi : "); ubahHarga=input.nextInt();
                                hargaSepatu = ubahHarga;
                                System.out.println("Harga sepatu berhasil diubah menjadi " + hargaSepatu);
                                break;
                                
                            case 3 : 
                                System.out.println("\nTas Rp. " + hargaTas);
                                System.out.print("Ubah harga menjadi ; "); ubahHarga=input.nextInt();
                                hargaTas = ubahHarga;
                                System.out.println("Harga tas berhasil diubah menjadi " + hargaTas);
                                break;
                                
                            case 4 :
                                System.out.println("\nTerima kasih");
                                break;
                                
                            default:
                                System.out.println("\nPilihan tidak ada");
                                break;
                        }
                    } while (pilih3!=4);
                    break;
                
                case 3 :
                    do{
                        System.out.println("\nSelamat datang role owner");
                        System.out.println("1. Melihat total semua transaksi penjualan"); 
                        System.out.println("2. Selesai");
                        System.out.print("Pilih : "); pilih4=input.nextInt();
                        
                        switch(pilih4){
                            case 1 :
                                System.out.println("\nTOTAL TRANSAKSI PENJUALAN");
                                hargaTotal = hargaTotal;
                                System.out.println(hargaTotal);
                                break;
                            
                            case 2 :
                                System.out.println("\nTerima kasih");
                                break;
                        }
                    } while (pilih4!=2);
                     break;
                
                case 4 : 
                    System.out.println("\nTerima kasih sudah menggunakan program");
                    break;
            }
            
                
        } while (pilih1!=4);
    }
}
