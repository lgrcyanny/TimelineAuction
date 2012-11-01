package com.timelineauction.fragments;

import java.util.ArrayList;
import java.util.HashMap;

import com.timelineauction.activities.MainActivity;
import com.timelineauction.activities.R;
import com.timelineauction.activities.R.string;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class RecommendFragment extends Fragment {
	private String[][] data = new String[][]{
			{" Apple iPod shuffle", "5min", "14.5$"},
			{" Apple iPod shuffle", "13min", "14.5$"},
			{" Apple iPod shuffle", "23min", "14.5$"},
			{" Apple iPod shuffle", "40min", "14.5$"},
			{" Apple iPod shuffle", "40min", "14.5$"},
			{" Apple iPod shuffle", "40min", "14.5$"},
			{" Apple iPod shuffle", "40min", "14.5$"}};
	private String[] keys = {"product_image", "product_title", "product_time_left", "product_current_bid"};
	private int[] identies = {R.id.product_image, R.id.product_title, R.id.product_time_left, R.id.product_current_bid};
	private ArrayList<HashMap<String, String>> producListData = new ArrayList<HashMap<String, String>>();
	private SimpleAdapter simpleAdapter = null;
	private ListView productListView = null;
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home,
				container, false);
		this.productListView = (ListView)view.findViewById(R.id.home_product_list);
		for (int i = 0; i < this.data.length; i++) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("product_image", String.valueOf(R.drawable.product));
			map.put("product_title", data[i][0]);
			map.put("product_time_left", data[i][1]);
			map.put("product_current_bid", data[i][2]);
			this.producListData.add(map);
		}
		
		this.simpleAdapter = new SimpleAdapter(super.getActivity(), this.producListData, R.layout.product_list, this.keys, this.identies);
		
		this.productListView.setAdapter(this.simpleAdapter);
		return view;
	}
	
}
