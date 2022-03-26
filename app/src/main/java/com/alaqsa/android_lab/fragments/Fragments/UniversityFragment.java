package com.alaqsa.android_lab.fragments.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alaqsa.android_lab.fragments.Activities.InfoActivity;
import com.alaqsa.android_lab.fragments.R;
import com.alaqsa.android_lab.fragments.databinding.FragmentUniversityBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UniversityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UniversityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "studentName";
    private static final String ARG_PARAM2 = "studentAddress";
    private FragmentUniversityBinding binding;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UniversityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UniversityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UniversityFragment newInstance(String param1, String param2) {
        UniversityFragment fragment = new UniversityFragment();
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
        this.binding=FragmentUniversityBinding.inflate(inflater);
        this.binding.personalData.setText(new StringBuilder("student Name : " + mParam1).append("\n").append("student Address : ").append(mParam2));
        Bundle bundle=new Bundle();
        bundle.putString(ARG_PARAM1,mParam1);
        bundle.putString(ARG_PARAM2,mParam2);

        this.binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent= new Intent(getActivity(), InfoActivity.class);
                intent.set
               intent.putExtra()
               startActivity();
            }
        });
        return this.binding.getRoot();
    }
}