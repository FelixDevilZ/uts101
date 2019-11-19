package com.example.uts101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentMiniquestion extends Fragment{
	EditText ejawab1,ejawab2;
	Button bjawab1,bjawab2;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_miniquestion, container, false);
		
		ejawab1 = (EditText)rootView.findViewById(R.id.etjawab1);
		bjawab1 = (Button)rootView.findViewById(R.id.btnjawab1);
		ejawab2 = (EditText)rootView.findViewById(R.id.etjawab2);
		bjawab2 = (Button)rootView.findViewById(R.id.btnjawab2);
		
		
		bjawab1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String lontong1 = ejawab1.getText().toString();
				
				if(lontong1.equals("yes")){
					Toast.makeText(getActivity(), "Anda pande", Toast.LENGTH_LONG).show();
				}
				else if(lontong1.equals("no")){
					Toast.makeText(getActivity(), "Anda sesat", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(getActivity(), "Coba Lagi", Toast.LENGTH_LONG).show();
				}
			}
			
		});
		
		bjawab2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				String lontong2 = ejawab2.getText().toString();
				
				if(lontong2.equals("yes")){
				
					Toast.makeText(getActivity(),"Kita Senasib" , Toast.LENGTH_LONG).show();
				}
				else if(lontong2.equals("no")){
				
					Toast.makeText(getActivity(), "Anda Beruntung", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(getActivity(), "coba lagi",Toast.LENGTH_LONG).show();
				}
				}
			
		});
		return rootView;
	}

}
