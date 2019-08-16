package uas.rani.app.mycontact;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/*
Tanggal Pengerjaan : 05 Agustus 2019
NIM : 10116177
Nama : Rani Marcelina
Kelas : AKB-4
*/

public class DaftarTeman extends Fragment {
    public DaftarTeman(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.daftarteman, container, false);

        getActivity().setTitle("Get Friend Contact");

        return view;
    }
}
