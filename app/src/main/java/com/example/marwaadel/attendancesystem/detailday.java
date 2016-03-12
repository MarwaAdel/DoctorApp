package com.example.marwaadel.attendancesystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.marwaadel.attendancesystem.model.Student;
import com.example.marwaadel.attendancesystem.utils.Constants;
import com.firebase.client.Firebase;
import com.firebase.client.ServerValue;

import java.util.HashMap;

public class detailday extends AppCompatActivity {
    ListView list2;
    StudentscheduleAdapter mStudentscheduleAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailday);
        list2 = (ListView) findViewById(R.id.list_view_student_lists2);

        Firebase refListName = new Firebase(Constants.FIREBASE_URL_ACTIVE_LIST);
        HashMap<String, Object> timestampCreated = new HashMap<>();
//        refListName.push().setValue(timestampCreated);/
        timestampCreated.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);

        Log.e("dateString", String.valueOf(refListName));

     //   Query query = refListName.orderByChild("timestamp").equalTo(String.valueOf(timestampCreated));

        mStudentscheduleAdapter = new StudentscheduleAdapter(detailday.this, Student.class,
                R.layout.list_item2, refListName);
        list2.setAdapter(mStudentscheduleAdapter);

//        HashMap<String, Object> timestampCreated = new HashMap<>();
//        timestampCreated.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
//        Query query = refListName.orderByChild("timestamp").equalTo(String.valueOf(timestampCreated));
//        query.addValueEventListener(new ValueEventListener() {
//     @Override
//    public void onDataChange(DataSnapshot dataSnapshot) {
//        for (DataSnapshot movieSnapshot : dataSnapshot.getChildren()) {
//
//            if (movieSnapshot.getLead().equals('Jack Nicholson')) {
//                console.log(movieSnapshot.getKey());
//            }
//        }
//    }
//
//    @Override
//    public void onCancelled(FirebaseError firebaseError) {
//
//    }
//});
//
        //  refListName.setValue(ServerValue.TIMESTAMP);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detailday, menu);
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
