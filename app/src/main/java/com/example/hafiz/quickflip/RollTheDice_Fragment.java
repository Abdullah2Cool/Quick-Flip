package com.example.hafiz.quickflip;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class RollTheDice_Fragment extends Fragment {

    private static final String TAG = "RollTheDice_Fragment";
    private Button btn;
    private ImageView dice1, dice2;
    private Random rand;
    private int[] DiceFaces = new int[]{R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.roll_the_dice_fragment_layout, container, false); // inflate (attaches) the layout for the fragment
        btn = view.findViewById(R.id.btnTab2); // reference important aspects of the layout for later modification based on their id
        dice1 = view.findViewById(R.id.dice1);
        dice2 = view.findViewById(R.id.dice2);
        rand = new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // set the onClickListener for when the button is pressed
                dice1.setImageResource(DiceFaces[rand.nextInt(DiceFaces.length)]); // pick a random image for dice 1
                dice2.setImageResource(DiceFaces[rand.nextInt(DiceFaces.length)]); // pick a random image for dice 2
            }
        });
        return view;
    }


}
