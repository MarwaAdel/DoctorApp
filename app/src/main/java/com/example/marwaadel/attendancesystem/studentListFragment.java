package com.example.marwaadel.attendancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.marwaadel.attendancesystem.model.Student;
import com.example.marwaadel.attendancesystem.utils.Constants;
import com.firebase.client.Firebase;

/**
 * A placeholder fragment containing a simple view.
 */
public class studentListFragment extends Fragment {
    ListView list;
    StudentAdapter mStudentListAdapter;
    public studentListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_student_list, container, false);
        list=(ListView)rootView.findViewById(R.id.list_view_student_lists);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), detailday.class));

            }
        });
        Firebase refListName = new Firebase(Constants.FIREBASE_URL_ACTIVE_LIST);
        mStudentListAdapter = new StudentAdapter(getActivity(), Student.class,
                R.layout.list_item, refListName);

        list.setAdapter(mStudentListAdapter);

        return rootView;
    }
}
