package PBO1;

public class Pegawai {
    //Atribut, Objek dan enkapulasi
    private String nama, nip, jabatan, lahir,telp;
    
    //Constructor
    public Pegawai(String nama, String nip, String jabatan,String lahir, String telp) {
        this.nama = nama;
        this.nip = nip;
        this.jabatan =jabatan;
        this.lahir =lahir;
        this.telp=telp;
    }

    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void setLahir(String lahir) {
        this.lahir = lahir;
    }
    
    public void setTelp(String telp) {
        this.telp = telp;
    }
    

    //accessor
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getLahir() {
        return lahir;
    }
    
    public String getTelp() {
        return telp;
    }
   
   //polymorfisme
    public String displayInfo(){
        return "Nama :"+getNama()+
                "\nNIP :"+getNip()+
                "\nJabatan :"+getJabatan()+
                "\nTempat Lahir :"+getLahir()+
                "\nNomor Telpon :"+getTelp();
    }
    
   
}
