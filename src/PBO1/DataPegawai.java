package PBO1;

//Pewarisan Inherintance
public class DataPegawai extends Pegawai {

    public DataPegawai(String nama, String nip, String jabatan, String lahir, String telp) {
        super(nama, nip, jabatan,lahir, telp);
    }

    public int getTTL(){
        return Integer.parseInt(getNip().substring(0,8));
    }
    
    public int getThnBln(){
        return Integer.parseInt(getNip().substring(8,14));
    }
    
    public String getjeniskelamin(){
        String jk = getNip().substring(14,15);
        //Seleksi Switch
        switch(jk){
            case "1":
                return "Laki-laki";
            case "2":
                return "Perempuan";
            default : 
                return "Ooppss!!! Jenis Kelamin Tidak Diketahui...";
        }
        
    }
    
    public int getUrut(){
        return Integer.parseInt(getNip().substring(15, 18));
    }

    public String gettelp(){
        String jk = getTelp().substring(0,2);
        //Seleksi If
        if(jk.equals("62")){
                return "Indonesia";
        } else if(jk.equals("08")){
                return "Indonesia";
        }
                return "Oopss!!! Kode yang dimasukkan salah...";
                } 
    
    //polymorfisme
    @Override
     public String displayInfo(){
         return super.displayInfo()+
                 "\nTahun Bulan Tanggal Lahir :"+getTTL()+
                 "\nTahun Bulan Masuk :"+getThnBln()+
                 "\nJenis Kelamin :"+getjeniskelamin()+
                 "\nNomor Urut CPNS :"+getUrut()+
                 "\nNegara :"+gettelp();
     }

}
