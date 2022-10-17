

public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("Munzani", "Steling", "087635928536");

        penggajian penggajian=new penggajian("Rp.4.700.000", "Rp.2.400.000", "Rp.4.400.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Teknisi Android");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }


}
