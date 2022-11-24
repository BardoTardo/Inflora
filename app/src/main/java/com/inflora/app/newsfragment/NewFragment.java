package com.inflora.app.newsfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inflora.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.inflora.app.adapter.ArticleAdapter;
import com.inflora.app.model.Article;

import java.util.ArrayList;
import java.util.List;

public class NewFragment extends Fragment {

    RecyclerView recyclerView;
    List<Article> mArticles;
    ArticleAdapter articleAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewNewsTitle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mArticles = new ArrayList<>();
        articleAdapter = new ArticleAdapter(getContext(),mArticles, true);
        recyclerView.setAdapter(articleAdapter);

        readArticles();

        return view;
    }

    private void readArticles() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("News");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                mArticles.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Article article = dataSnapshot.getValue(Article.class);
                    mArticles.add(article);
                }
                articleAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}