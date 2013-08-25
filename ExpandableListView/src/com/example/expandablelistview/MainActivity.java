package com.example.expandablelistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {

	private String[]groupStrings=new String[]{
			"Group1",
			"Group2",
			"Group3"
	};
	private String[][]childStrings=new String[][]{
			{
				"1-item1",
				"1-item2",
				"1-item3",
				"1-item4",
				"1-item5",
				"1-item6",
				"1-item7",
				"1-item4",
				"1-item8",
				"1-item9",
				"1-item10",
				"1-item11",
				"1-item12",
				"1-item13",
				"1-item14",
				"1-item15",
				"1-item16",
				"1-item17",
				"1-item18",
				"1-item19"
			},
			{
				"2-item1",
				"2-item2",
				"2-item3",
				"2-item4"
			},
			{
				"3-item1",
				"3-item2",
				"3-item3",
				"3-item4"
			}
	};
	private ExpandableListViewAdapter expandableListViewAdapter=null;
	
	private ExpandableListView expandableListView=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		expandableListViewAdapter=new ExpandableListViewAdapter(groupStrings, childStrings, this);
		
		expandableListView=(ExpandableListView) findViewById(R.id.expandableListView);
		expandableListView.setAdapter(expandableListViewAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
