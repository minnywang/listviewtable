package com.example.listviewtable;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TableAdapter extends BaseAdapter {
	private List<Person> list;
	private LayoutInflater inflater;
	
	public TableAdapter(Context context, List<Person> list){
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Person person = (Person) this.getItem(position);
		ViewHolder viewHolder;
		if(convertView == null){
			viewHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.list_item, null);
			viewHolder.mTextName = (TextView) convertView.findViewById(R.id.text_name);
			viewHolder.mTextSex = (TextView) convertView.findViewById(R.id.text_sex);
			viewHolder.mTextAge = (TextView) convertView.findViewById(R.id.text_age);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		viewHolder.mTextName.setText(person.getName());
		viewHolder.mTextSex.setText(person.getSex());
		viewHolder.mTextAge.setText(person.getAge() + "Ëê");
		
		
		return convertView;
	}
	
	public static class ViewHolder{
		public TextView mTextName;
		public TextView mTextSex;
		public TextView mTextAge;
		
	}

}
