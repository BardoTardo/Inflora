package com.inflora.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inflora.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.inflora.app.model.Article;
import com.squareup.picasso.Picasso;

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

        Article article = mArticle.get(position);
        holder.articleTitle.setText(article.getTitle());
        holder.articleContent.setText(article.getContent());

        Picasso.get().load(article.getImageURL()).placeholder(R.mipmap.ic_launcher).into(holder.articleImage);
    }

    @Override
    public int getItemCount() {
        return mArticle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView articleImage;
        public TextView articleTitle;
        public TextView articleContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            articleImage = itemView.findViewById(R.id.articleImage);
            articleTitle = itemView.findViewById(R.id.articleTitle);
            articleContent = itemView.findViewById(R.id.articleContent);
        }
    }
}
