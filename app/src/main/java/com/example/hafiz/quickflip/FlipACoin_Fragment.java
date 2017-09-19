package com.example.hafiz.quickflip;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FlipACoin_Fragment extends Fragment {

    private static final String TAG = "My Tag";
    private Button btn;
    private TextView textView;
    private ImageView imageView;
    private String message;
    private int nRandom;
    private Random rand;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.flip_a_coin_fragment_layout, container, false);
        btn = view.findViewById(R.id.btnTab1);
        imageView = view.findViewById(R.id.imageView);
        rand = new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nRandom = rand.nextInt(10);
                if (nRandom % 2 == 0) {
                    imageView.setImageResource(R.drawable.tails);
                    Toast.makeText(getActivity(), "It's Tails", Toast.LENGTH_SHORT).show();
                } else {
                    imageView.setImageResource(R.drawable.heads);
                    Toast.makeText(getActivity(), "It's Heads", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }


}
