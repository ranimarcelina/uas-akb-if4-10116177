package uas.rani.app.mycontact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

/*
Tanggal Pengerjaan : 05 Agustus 2019
NIM : 10116177
Nama : Rani Marcelina
Kelas : AKB-4
*/

public class LoadActivity extends AppCompatActivity {
    Realm realm;
    EditText nim, nama, alamat,telepon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        TextView textView = (TextView)findViewById(R.id.textView);
        Realm realm = Realm.getDefaultInstance();
        RealmResults <User> results1 = realm.where(User.class).findAll();
        String text= "";


        for (User c:results1){

            text = text+c.getUnder()+"\n";
            text = text+c.getNim()+"\n";
            text = text+c.getNama()+"\n";
            text = text+c.getAlamat()+"\n";
            text = text+c.getTelepon()+"\n";
            text = text+c.getEmail()+"\n";
            text = text+c.getSosmed()+"\n";
            text = text+c.getUnder()+"\n";





        }
        textView.setText(text);

    }
}
