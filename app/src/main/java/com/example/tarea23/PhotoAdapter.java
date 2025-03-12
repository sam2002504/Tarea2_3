package com.example.tarea23;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhotoAdapter extends BaseAdapter {
    private Context context;
    private List<Photograph> photos;

    public PhotoAdapter(Context context, List<Photograph> photos) {
        this.context = context;
        this.photos = photos;
    }

    @Override
    public int getCount() {
        return photos.size();
    }

    @Override
    public Object getItem(int position) {
        return photos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_photo, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        Photograph photo = photos.get(position);

        Bitmap bitmap = BitmapFactory.decodeByteArray(photo.getImage(), 0, photo.getImage().length);
        imageView.setImageBitmap(bitmap);
        textView.setText(photo.getDescription());

        return convertView;
    }


}
