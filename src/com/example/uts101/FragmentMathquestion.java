 package com.example.uts101;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentMathquestion extends Fragment{
	ListView tmath1;
	String[] menumate = {"Basic Aritmatic", "2D Shapes","Sequences and Series"};
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_mathquestion, container, false);
		
		tmath1 = (ListView)rootView.findViewById(R.id.tvmath1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, menumate);
		tmath1.setAdapter(adapter);
		tmath1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					Fragmentadsr fragmentadsr = new Fragmentadsr();
					FragmentManager fragmentManager = getFragmentManager();
        			FragmentTransaction ft = fragmentManager.beginTransaction();
        			ft.replace(R.id.content_frame, fragmentadsr);
        			ft.commit();
					}
				else if(arg2 == 1){
					Toast.makeText(getActivity(), "bukan bagian saya.", Toast.LENGTH_LONG).show();
					}
				else if(arg2 == 2){
					Toast.makeText(getActivity(), "bukan bagian saya.", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		return rootView;
}}