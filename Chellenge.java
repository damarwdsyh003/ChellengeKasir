
package chellenge.kasir.newpackage;
import javax.swing.JOptionPane;
public class Chellenge {
    String merk1, warna1, jenissepatu1, kategorisepatu1, size1, harga1;
    int struk,price1, total, diskon;
    String merk2, warna2, jenissepatu2, kategorisepatu2, size2, harga2;
    int price2, total2;
    String merk3, warna3, jenissepatu3, kategorisepatu3, size3, harga3;
    int price3, total3;
    
    public void ChellengeKasir(){
        JOptionPane.showMessageDialog(null,"SELAMAT DATANG");
        
        merk1 = JOptionPane.showInputDialog(null,"910"+"\nAdidas"+"\nNike"+"\nSkechers"+"\nPuma"+"\nReebok"+"\nVans"+"\nConverse"+"\nFila"+"\n\nPilih merk sepatu");
        
        warna1 = JOptionPane.showInputDialog(null,"Black"+"\nWhite"+"\nGold"+"\nSilver"+"\nOrange"+"\nGreen"+"\nYellow"+"\nBlue"+"\nRed"+"\n\nPilih warna untuk sepatu");
        
        jenissepatu1 = JOptionPane.showInputDialog(null,"Pria"+"\nWanita"+"\n\nPilih Jenis Sepatu");
        
        kategorisepatu1 = JOptionPane.showInputDialog(null,"Sepatu Olahraga"+"\nSepatu Sneakers"+"\nSepatu Lari"+"\nSepatu Kantor"+"\n\nPilih kategori sepatu yang diinginkan");
        
        size1 = JOptionPane.showInputDialog(null,"25"+"\n26"+"\n27"+"\n28"+"\n29"+"\n30"+"\n31"+"\n32"+"\n33"+"\n34"+"\n\nPilih ukuran sepatu yang diinginkan");
        
        harga1 = JOptionPane.showInputDialog(null,"200000"+"\n300000"+"\n400000"+"\n500000"+"\n600000"+"\n700000"+"\n800000"+"\n900000"+"\n\nPilih Harga Yang ingin didapat");
        
        price1 = Integer.parseInt(harga1);
        
        total =+price1;
        
        
        
        System.out.println("            =======KASIR JAYA BARU=======");
        System.out.println("==============================================================");
        System.out.println("MERK            : "+merk1);
        System.out.println("WARNA SEPATU    : "+warna1);
        System.out.println("JENIS SEPATU    : "+jenissepatu1);
        System.out.println("KATEGORI SEPATU : "+kategorisepatu1);
        System.out.println("UKURAN SEPATU   : "+size1);
        System.out.println("==============================================================");
        System.out.println("HARGA           : "+price1);
        System.out.println("==============================================================");
        
        struk = JOptionPane.showConfirmDialog(null, "INGIN MENAMBAH SEPATU"+JOptionPane.YES_NO_OPTION);
        
        if (struk == 0){
            tambah();
        }else{
            JOptionPane.showMessageDialog(null,"TERIMAKASIH SUDAH BERBELANJA");
            System.exit(0);
        }       
    }
    
    public void tambah(){
        merk2 = JOptionPane.showInputDialog(null,"910"+"\nAdidas"+"\nNike"+"\nSkechers"+"\nPuma"+"\nReebok"+"\nVans"+"\nConverse"+"\nFila"+"\n\nPilih merk sepatu");
        
        warna2 = JOptionPane.showInputDialog(null,"Black"+"\nWhite"+"\nGold"+"\nSilver"+"\nOrange"+"\nGreen"+"\nYellow"+"\nBlue"+"\nRed"+"\n\nPilih warna untuk sepatu");
        
        jenissepatu2 = JOptionPane.showInputDialog(null,"Pria"+"\nWanita"+"\n\nPilih Jenis Sepatu");
        
        kategorisepatu2 = JOptionPane.showInputDialog(null,"Sepatu Olahraga"+"\nSepatu Sneakers"+"\nSepatu Lari"+"\nSepatu Kantor"+"\n\nPilih kategori sepatu yang diinginkan");
        
        size2 = JOptionPane.showInputDialog(null,"25"+"\n26"+"\n27"+"\n28"+"\n29"+"\n30"+"\n31"+"\n32"+"\n33"+"\n34"+"\n\nPilih ukuran sepatu yang diinginkan");
        
        harga2 = JOptionPane.showInputDialog(null,"200000"+"\n300000"+"\n400000"+"\n500000"+"\n600000"+"\n700000"+"\n800000"+"\n900000"+"\n\nPilih Harga Yang ingin didapat");
        
        price2 = Integer.parseInt(harga1);
        
        total =price1+price2;
        diskon = total - 50000;
        
        System.out.println("            =======KASIR JAYA BARU=======");
        System.out.println("==============================================================");
        System.out.println("MERK            : "+merk1);
        System.out.println("                : "+merk2);
        System.out.println("WARNA SEPATU    : "+warna1);
        System.out.println("                : "+warna2);
        System.out.println("JENIS SEPATU    : "+jenissepatu1);
        System.out.println("                : "+jenissepatu2);
        System.out.println("KATEGORI SEPATU : "+kategorisepatu1);
        System.out.println("                : "+kategorisepatu2);
        System.out.println("UKURAN SEPATU   : "+size1);
        System.out.println("                : "+size2);
        System.out.println("==============================================================");
        System.out.println("HARGA           : "+price1);
        System.out.println("                : "+price2);
        System.out.println("TOTAL           : "+total);
        System.out.println("DISKON          : 50000");
        System.out.println("TOTAL           : "+diskon);
        System.out.println("==============================================================");
        
        struk = JOptionPane.showConfirmDialog(null, "INGIN MENAMBAH SEPATU?"+JOptionPane.YES_NO_OPTION);
        if (struk == 0){
            tambahlagi();
        }else{
            JOptionPane.showMessageDialog(null, "Have a Nice Day");
            System.exit(0);
        }       
    }
    
    public void tambahlagi(){
        merk3 = JOptionPane.showInputDialog(null,"910"+"\nAdidas"+"\nNike"+"\nSkechers"+"\nPuma"+"\nReebok"+"\nVans"+"\nConverse"+"\nFila"+"\n\nPilih merk sepatu");
        
        warna3 = JOptionPane.showInputDialog(null,"Black"+"\nWhite"+"\nGold"+"\nSilver"+"\nOrange"+"\nGreen"+"\nYellow"+"\nBlue"+"\nRed"+"\n\nPilih warna untuk sepatu");
        
        jenissepatu3 = JOptionPane.showInputDialog(null,"Pria"+"\nWanita"+"\n\nPilih Jenis Sepatu");
        
        kategorisepatu3 = JOptionPane.showInputDialog(null,"Sepatu Olahraga"+"\nSepatu Sneakers"+"\nSepatu Lari"+"\nSepatu Kantor"+"\n\nPilih kategori sepatu yang diinginkan");
        
        size3 = JOptionPane.showInputDialog(null,"25"+"\n26"+"\n27"+"\n28"+"\n29"+"\n30"+"\n31"+"\n32"+"\n33"+"\n34"+"\n\nPilih ukuran sepatu yang diinginkan");
        
        harga3 = JOptionPane.showInputDialog(null,"200000"+"\n300000"+"\n400000"+"\n500000"+"\n600000"+"\n700000"+"\n800000"+"\n900000"+"\n\nPilih Harga Yang ingin didapat");
        if (harga3 == harga3){
            
        }
        price3 = Integer.parseInt(harga1);
        
        total =price1+price2+price3;
        diskon = total - 100000;
        
        System.out.println("            =======KASIR JAYA BARU=======");
        System.out.println("==============================================================");
        System.out.println("MERK            : "+merk1);
        System.out.println("                : "+merk2);
        System.out.println("                : "+merk3);
        System.out.println("WARNA SEPATU    : "+warna1);
        System.out.println("                : "+warna2);
        System.out.println("                : "+warna3);
        System.out.println("JENIS SEPATU    : "+jenissepatu1);
        System.out.println("                : "+jenissepatu2);
        System.out.println("                : "+jenissepatu3);
        System.out.println("KATEGORI SEPATU : "+kategorisepatu1);
        System.out.println("                : "+kategorisepatu2);
        System.out.println("                : "+kategorisepatu3);
        System.out.println("UKURAN SEPATU   : "+size1);
        System.out.println("                : "+size2);
        System.out.println("                : "+size3);
        System.out.println("==============================================================");
        System.out.println("HARGA           : "+price1);
        System.out.println("                : "+price2);
        System.out.println("                : "+price3);
        System.out.println("TOTAL           : "+total);
        System.out.println("DISKON          : 100000");
        System.out.println("TOTAL           : "+diskon);
        System.out.println("==============================================================");
        
        if (struk == 0){
            JOptionPane.showMessageDialog(null, "Mohon Maaf!"+"\nStok Telah Habis");
            System.exit(0);
        }
    }
}

