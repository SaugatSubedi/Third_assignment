package com.novc21.esoftwarica.fragment;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.novc21.esoftwarica.MainActivity;
import com.novc21.esoftwarica.R;
import com.novc21.esoftwarica.adapter.Students;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    EditText etName, etAge, etAddress;
    RadioGroup rgGender;
    Button btnSave;
    String name, address, gender = "male";
    int age;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
