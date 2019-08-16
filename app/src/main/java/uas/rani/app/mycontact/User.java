package uas.rani.app.mycontact;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/*
Tanggal Pengerjaan : 05 Agustus 2019
NIM : 10116177
Nama : Rani Marcelina
Kelas : AKB-4
*/


public class User extends RealmObject {
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @PrimaryKey
    private String nim;




    @Required
    private String nama;

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Required
    private String telepon;

    @Required
    private String alamat;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSosmed() {
        return sosmed;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }

    @Required
    private String email;
    @Required
    private String sosmed;

    public String getUnder() {
        return under;
    }

    public void setUnder(String under) {
        this.under = under;
    }

    @Required
    private String under;




}
