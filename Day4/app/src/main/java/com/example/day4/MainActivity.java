package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Graduate> mylist = new ArrayList<>();

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView studentname , studentage;
        ImageView studentPhoto;
        Button nextpicture;


         studentname = findViewById(R.id.textViewStudentName);
         studentage = findViewById(R.id.textViewStudentAge);
        nextpicture = findViewById(R.id.buttonNext);
        studentPhoto= findViewById(R.id.imageView5);

        Graduate st1 = new Graduate("مريم", 18, R.drawable.picture1);
        Graduate st2 = new Graduate("ساره", 18, R.drawable.picture2);
        Graduate st3 = new Graduate("يوسف", 18, R.drawable.picture3);

        mylist.add(st1);
        mylist.add(st2);
        mylist.add(st3);

        studentname.setText(mylist.get(count).getStudentname());
        studentage.setText(mylist.get(count).getStudentage() + "");
        studentPhoto.setImageResource(mylist.get(count).getStudentpicture());

        nextpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;

                if (count == mylist.size()){

                    count =0;
                }

                studentname.setText(mylist.get(count).getStudentname());
                studentage.setText(mylist.get(count).getStudentage() + "");
                studentPhoto.setImageResource(mylist.get(count).getStudentpicture());

            }

        });







    }
}