package com.example.marwaadel.attendancesystem;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.example.marwaadel.attendancesystem.model.Student;
import com.example.marwaadel.attendancesystem.utils.Utils;
import com.firebase.client.Query;
import com.firebase.ui.FirebaseListAdapter;

import java.util.Date;

/**
 *
 * Created by Merna on 3/7/2016.
 */
public class StudentAdapter extends FirebaseListAdapter<Student> {

    public StudentAdapter(Activity activity, Class<Student> modelClass, int modelLayout, Query ref) {
        super(activity, modelClass, modelLayout, ref);
    }

    @Override
    protected void populateView(View v, Student model) {

        TextView date = (TextView) v.findViewById(R.id.date);
        TextView time = (TextView) v.findViewById(R.id.time);
        if (model.getDate() != null) {
            date.setText(
                    Utils.DATE_FORMAT.format(new Date(model.getDateLong())));


        } else {
            date.setText("");
        }
        if (model.getTime() != null) {
            time.setText(
                    Utils.TIME_FORMAT.format(new Date(model.getTimeLong())));


        } else {
            time.setText("");
        }
    }
}
