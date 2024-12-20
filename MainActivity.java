package com.example.temp;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewLion;
    private Button buttonLeft, buttonRight;

    private int currentImageIndex = 0;
    private int[] images = {
            R.drawable.lion1,
            R.drawable.lion2,
            R.drawable.lion3,
            R.drawable.lion4,
            R.drawable.lion5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewLion = findViewById(R.id.imageViewLion);
        buttonLeft = findViewById(R.id.buttonLeft);
        buttonRight = findViewById(R.id.buttonRight);


        imageViewLion.setImageResource(images[currentImageIndex]);

        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex--;
                if (currentImageIndex < 0) {
                    currentImageIndex = images.length - 1;
                }
                imageViewLion.setImageResource(images[currentImageIndex]);
            }
        });


        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex++;
                if (currentImageIndex >= images.length) {
                    currentImageIndex = 0;
                }
                imageViewLion.setImageResource(images[currentImageIndex]);
            }
        });
    }
}
