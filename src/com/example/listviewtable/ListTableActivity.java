package com.example.listviewtable;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

public class ListTableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//设置表格标题的背景颜色
		ViewGroup tableTitle = (ViewGroup) findViewById(R.id.table_title);
		tableTitle.setBackgroundColor(Color.rgb(255, 100, 10));
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		list.add(new Person("刘德华", "男", 50));
		
		ListView tableListView = (ListView) findViewById(R.id.list);
		TableAdapter adapter = new TableAdapter(this, list);
		tableListView.setAdapter(adapter);
	}


}
