package com.rovertech.bottomsheet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CoordinatorLayout coordinatorLayout;
    BottomSheetBehavior behavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.mainLayout);
        View bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                // React to state change
               // Toast.makeText(MainActivity.this, String.valueOf(newState), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                // React to dragging events
            }
        });


    }

    public void btnClick(View view) {


        if (behavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
            behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        } else {
            behavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        }


    }


    public void btnClickSVG(View view) {
    }
}
