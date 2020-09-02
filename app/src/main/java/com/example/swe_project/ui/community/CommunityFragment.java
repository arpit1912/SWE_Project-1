package com.example.swe_project.ui.community;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.swe_project.DiscoverMapsActivity;
import com.example.swe_project.R;

public class CommunityFragment extends Fragment {

    private CardView leader, activities;
    View vi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_community, container, false);

        leader = (CardView) root.findViewById(R.id.leaderboard);

        activities = (CardView) root.findViewById(R.id.activity);


        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vi = view;
                openActivity2();
                //Toast.makeText(vi.getContext(), "Not available" , Toast.LENGTH_SHORT ).show();
            }
        });


        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vi = view;
                openActivity();
            }
        });

        return root;

    }


    private void openActivity() {
        Intent intent = new Intent(vi.getContext(), activites.class);

        vi.getContext().startActivity(intent);
    }

    private void openActivity2() {
        Intent intent = new Intent(vi.getContext(), leaderboardtable.class);

        vi.getContext().startActivity(intent);
    }
/*
    public void onClick(View v)
    {
        Intent i;

        switch (v.getId()){
            case R.id.leaderboard : Toast.makeText(v.getContext(), "Not available" , Toast.LENGTH_SHORT ).show();
            case R.id.activity : i = new Intent(v.getContext(), activitesFragment.class); break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
*/

    }