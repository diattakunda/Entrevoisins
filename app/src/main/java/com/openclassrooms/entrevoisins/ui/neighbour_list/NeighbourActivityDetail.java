package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
// declaration variables
public class NeighbourActivityDetail extends AppCompatActivity {
    private ImageView mImageView;
    private TextView mImageCaroline;
    private ImageButton mReturnArrow;
    private ImageButton mFAB;
    private TextView mCaroline;
    private TextView mLocalisation;
    private TextView mPhone;
    private TextView mEmail;
    private TextView mAProposDeMoi;
    private TextView mInfo;
    private NeighbourApiService mApiService;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neighbour_activity_detail);

        // Récuperer l'intent et lui donner les infos de la clé
        Intent NeighbourActivityIntent = new Intent(NeighbourActivityDetail.this, NeighbourActivityDetail.class);

        // Branchements des widgets
        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageCaroline = (TextView) findViewById(R.id.ImageCaroline);
        mFAB = (ImageButton) findViewById(R.id.FAB);
        mCaroline = (TextView) findViewById(R.id.Caroline);
        mLocalisation = (TextView) findViewById(R.id.localisation);
        mPhone = (TextView) findViewById(R.id.phone);
        mEmail = (TextView) findViewById(R.id.email);
        mAProposDeMoi = (TextView) findViewById(R.id.AProposDeMoi);
        mInfo = (TextView) findViewById(R.id.info);
        mReturnArrow = (ImageButton) findViewById(R.id.returnArrow);
    }
}

