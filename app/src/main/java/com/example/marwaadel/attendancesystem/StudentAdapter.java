package com.example.marwaadel.attendancesystem;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.example.marwaadel.attendancesystem.model.Student;
import com.example.marwaadel.attendancesystem.utils.Constants;
import com.example.marwaadel.attendancesystem.utils.Utils;
import com.firebase.client.Firebase;
import com.firebase.client.Query;
import com.firebase.ui.FirebaseListAdapter;

import java.util.Date;

/**
 * Created by Marwa Adel on 3/16/2016.
 */
public class StudentAdapter extends FirebaseListAdapter<Student> {
    Firebase ref;

    public StudentAdapter(Activity activity, Class<Student> modelClass, int modelLayout, Query ref) {
        super(activity, modelClass, modelLayout, ref);
    }

    @Override
    protected void populateView(View v, Student model) {

        TextView date = (TextView) v.findViewById(R.id.date);
        TextView time = (TextView) v.findViewById(R.id.time);


        if (model.getTimestampLastChanged() != null) {
            date.setText(
                    Utils.SIMPLE_DATE_FORMAT.format(new Date(model.getTimestampLastChangedLong())));
            time.setText(
                    Utils.SIMPLE_TIME_FORMAT.format(new Date(model.getTimestampLastChangedLong())));
            ref = new Firebase(Constants.FIREBASE_URL_ACTIVE_LIST);

            //Query query = refListName.orderByChild("timestamp").equalTo(String.valueOf(timestampCreated));
        } else {
            date.setText("");
            //Query query;
            // query = ref.orderByChild("timestamp").equalTo("date.setText(\"\")");
            time.setText("");
        }
    }

}
