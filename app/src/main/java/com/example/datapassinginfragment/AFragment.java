package com.example.datapassinginfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AFragment extends Fragment {
    public static final String Arg1="Argument1";
    public static final String Arg2="Argument2";
    public AFragment() {
        // Required empty public constructor
    }
    public  static AFragment getInstance(String value1,int value2){
        AFragment aFragment=new AFragment();
        Bundle bundle =new Bundle();
        bundle.putString(Arg1,value1);
        bundle.putInt(Arg2, value2);
        aFragment.setArguments(bundle);
        return  aFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(getArguments()!=null){
            String name=getArguments().getString(Arg1);
            int number=getArguments().getInt(Arg2);
        }
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}