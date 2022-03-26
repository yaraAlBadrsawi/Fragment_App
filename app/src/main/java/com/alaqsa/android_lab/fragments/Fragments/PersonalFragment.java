package com.alaqsa.android_lab.fragments.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alaqsa.android_lab.fragments.R;
import com.alaqsa.android_lab.fragments.databinding.FragmentPersonalBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private FragmentPersonalBinding binding;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PersonalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StudentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PersonalFragment newInstance(String param1, String param2) {
        PersonalFragment fragment = new PersonalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        this.binding=FragmentPersonalBinding.inflate(inflater);
        Bundle bundle=new Bundle();
        this.binding.next.setOnClickListener(view -> {
            if (binding.studentName.getEditText().getText().toString().isEmpty()
                    || binding.studentAddress.getEditText().getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "you must fill all", Toast.LENGTH_SHORT).show();
            } else {
                bundle.putString("studentName",binding.studentName.getEditText().getText().toString());
                bundle.putString("studentAddress",binding.studentName.getEditText().getText().toString());
                UniversityFragment universityFragment=new UniversityFragment();
                universityFragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(container.getId(),universityFragment).commit();
            }
        });


        return this.binding.getRoot();
    }
}