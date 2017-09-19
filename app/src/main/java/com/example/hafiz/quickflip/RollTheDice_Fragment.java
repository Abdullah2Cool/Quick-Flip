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

    private static final String TAG = "My Tag";
    private Button btn;
    private ImageView dice1, dice2;
    private Random rand;
    private int[] DiceFaces = new int[]{R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.roll_the_dice_fragment_layout, container, false);
        btn = view.findViewById(R.id.btnTab2);
        dice1 = view.findViewById(R.id.dice1);
        dice2 = view.findViewById(R.id.dice2);
        rand = new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dice1.setImageResource(DiceFaces[rand.nextInt(DiceFaces.length)]);
                dice2.setImageResource(DiceFaces[rand.nextInt(DiceFaces.length)]);
            }
        });
        return view;
    }


}
