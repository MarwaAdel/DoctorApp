package com.example.marwaadel.attendancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.marwaadel.attendancesystem.model.Student;
import com.example.marwaadel.attendancesystem.utils.Constants;
import com.firebase.client.Firebase;

public class MainActivity extends BaseActivity {

    ListView list;
    StudentAdapter mStudentListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list_view_student_lists);
        Firebase refListName = new Firebase(Constants.FIREBASE_URL_ACTIVE_LIST);
        mStudentListAdapter = new StudentAdapter(this, Student.class,
                R.layout.list_item, refListName);

        list.setAdapter(mStudentListAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(), detailday.class));

            }
        });


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        mStudentListAdapter.cleanup();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
