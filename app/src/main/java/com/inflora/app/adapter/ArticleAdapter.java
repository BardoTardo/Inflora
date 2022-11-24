package com.inflora.app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inflora.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.inflora.app.DisplayArticle;
import com.inflora.app.model.Article;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder>{

    private Context mContext;
    private List<Article> mArticle;
    private boolean isFragment;

    public ArticleAdapter(Context mContext, List<Article> mArticle, boolean isFragment) {
        this.mContext = mContext;
        this.mArticle = mArticle;
        this.isFragment = isFragment;
    }

    private FirebaseUser firebaseUser;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.article_item, parent,false);
        return new ArticleAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("News");

        Article article = mArticle.get(position);
        holder.articleTitle.setText(article.getTitle());
        holder.articleContent.setText(article.getContent());
        holder.articleViews.setText(String.valueOf(article.getViews()));

        String imgUrl = article.getImageURL();

        Picasso.get().load(imgUrl).placeholder(R.mipmap.ic_launcher).into(holder.articleImage);

        holder.articleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DisplayArticle.class);
                intent.putExtra("title", article.getTitle());
                intent.putExtra("date", article.getDate());
                intent.putExtra("content", article.getContent());
                intent.putExtra("views", String.valueOf(article.getViews()));
                intent.putExtra("imgUrl", article.getImageURL());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArticle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView articleImage;
        public TextView articleTitle;
        public TextView articleContent;
        public TextView articleViews;
        public boolean isBookmarked;
        public ConstraintLayout articleItem;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            articleImage = itemView.findViewById(R.id.articleImage);
            articleTitle = itemView.findViewById(R.id.articleTitle);
            articleContent = itemView.findViewById(R.id.articleContent);
            articleViews = itemView.findViewById(R.id.articleViews);
            articleItem = itemView.findViewById(R.id.articleItem);
        }
    }
}
