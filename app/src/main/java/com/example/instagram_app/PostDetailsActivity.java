package com.example.instagram_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.parceler.Parcels;

import java.util.Date;

public class PostDetailsActivity extends AppCompatActivity {

    // The post to display
    Post post;

    // The view objects
    TextView tvDescription2;
    TextView tvTimestamp;
    ImageView ivDetailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        // Resolve the view objects
        tvDescription2 = findViewById(R.id.tvDescription2);
        tvTimestamp = findViewById(R.id.tvTimestamp);
        ivDetailImage = findViewById(R.id.ivDetailImage);

        if (getIntent().getExtras() != null) {
            post = (Post) getIntent().getParcelableExtra("Post");
        }

        // Set the description
        tvDescription2.setText(post.getDescription());

        // Get relative time ago
        Date createdAt = post.getCreatedAt();
        String timeAgo = Post.calculateTimeAgo(createdAt);
        tvTimestamp.setText(timeAgo);

        // Put image into view
        post.getImage();
        if (post.getImage() != null) {
            Glide.with(this).load(post.getImage().getUrl()).into(ivDetailImage);
        }
    }
}