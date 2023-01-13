package com.example.ptboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ManagementActivity extends AppCompatActivity {

    private ListView listView;
    private UserListAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        Intent intent = getIntent();

        listView = (ListView) findViewById(R.id.listView);
        userList = new ArrayList<User>();

        adapter = new UserListAdapter(getApplicationContext(), userList);
        listView.setAdapter(adapter);

        try{
            JSONObject jsonObject = new JSONObject(intent.getStringExtra("userList"));
            JSONArray jsonArray = jsonObject.getJSONArray("response");
            int count = 0;
            String writer, store, pt_number, pt_name;
            while(count < jsonArray.length())
            {
                JSONObject object = jsonArray.getJSONObject(count);
                writer = object.getString("writer");
                store = object.getString("store");
                pt_number = object.getString("pt_number");
                pt_name = object.getString("pt_name");
                User user = new User(writer, store, pt_number, pt_name);
                userList.add(user);
                count++;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}