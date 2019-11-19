package com.example.uts101;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragmentadsr extends Fragment{

	EditText etaritmatik;
	Button btnaritmatik;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_adsr, container, false);
		
		etaritmatik = (EditText)rootView.findViewById(R.id.etadsr);
		btnaritmatik = (Button)rootView.findViewById(R.id.btnadsr);
		
		btnaritmatik.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans1 = etaritmatik.getText().toString();
				int ans11 = Integer.parseInt(etaritmatik.getText().toString());
				if(ans11 == 11){
					Toast.makeText(getActivity(), "benar", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "salah", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
		
		return rootView;
	}
}

