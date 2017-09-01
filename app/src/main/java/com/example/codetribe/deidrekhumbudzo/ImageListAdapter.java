package com.example.codetribe.deidrekhumbudzo;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by codetribe on 8/1/2017.
 */

public class ImageListAdapter extends ArrayAdapter<ImageUpload> {
    private Activity context;
    private int resource;
    private List<ImageUpload> listImage;

    public ImageListAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ImageUpload> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listImage = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View v = inflater.inflate(resource, null);
        TextView tvName =  v.findViewById(R.id.tvImageName);
        ImageView img =  v.findViewById(R.id.imgView);
        TextView description =  v.findViewById(R.id.description);
        TextView whatwedo =  v.findViewById(R.id.whatwedos);
        TextView program =  v.findViewById(R.id.programs);

        tvName.setText(listImage.get(position).getName());
        description.setText(listImage.get(position).getDescription());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);
       whatwedo.setText(listImage.get(position).getWhatwedo());
        program.setText(listImage.get(position).getProgram());

        return v;

    }

}