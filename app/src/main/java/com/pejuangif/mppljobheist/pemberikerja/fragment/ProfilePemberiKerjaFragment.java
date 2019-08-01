package com.pejuangif.mppljobheist.pemberikerja.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pejuangif.mppljobheist.MainActivity;
import com.pejuangif.mppljobheist.R;
import com.pejuangif.mppljobheist.model.Users;
import com.pejuangif.mppljobheist.pemberikerja.EditProfilePemberiKerjaActivity;
import com.pejuangif.mppljobheist.pemberikerja.PemberiKerjaActivity;

public class ProfilePemberiKerjaFragment extends Fragment implements View.OnClickListener {
    public static String EXTRA_PEMBERI_KERJA = "extra-pemberi-kerja";
    LinearLayout ubahprofil,bantuan,keluar,tentangaplikasi;
    TextView tvname;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_profile_pemberi_kerja,container,false);
        ((PemberiKerjaActivity)getActivity()).actionbar.setTitle("Profile");
        Users users = ((PemberiKerjaActivity)getActivity()).getIntent().getParcelableExtra(EXTRA_PEMBERI_KERJA);
        tvname= view.findViewById(R.id.tv_profile_name);
        ubahprofil=view.findViewById(R.id.ubah_profile);
        bantuan=view.findViewById(R.id.help);
        keluar=view.findViewById(R.id.logout);
        tentangaplikasi=view.findViewById(R.id.about);

        tvname.setText(users.getName());
        ubahprofil.setOnClickListener(this);
        bantuan.setOnClickListener(this);
        keluar.setOnClickListener(this);
        tentangaplikasi.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.ubah_profile:
                intent=new Intent(getContext(),EditProfilePemberiKerjaActivity.class);
                startActivity(intent);
                break;
            case R.id.help:

                break;
            case R.id.logout:
                intent=new Intent(getContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.about:

                break;
        }
    }
}
