package com.inceptionteam.Menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.inceptionteam.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    List<MenuItem> mData;
    Callback listener;
    Context context;

    public MenuAdapter(List<MenuItem> mData,Callback listener , Context context) {
        this.mData = mData;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.icon.setImageResource(mData.get(position).getIcon());
        if (mData.get(position).isSelected()) {
            holder.isSelected.setVisibility(View.VISIBLE);
            holder.icon.setColorFilter(context.getColor(R.color.lightBlue));
        }
        else {
            holder.isSelected.setVisibility(View.GONE);
            holder.icon.setColorFilter(context.getColor(R.color.icon_tint_light));
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MenuViewHolder extends RecyclerView.ViewHolder{
        ImageView icon,isSelected;

        public MenuViewHolder(@NonNull final View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.item_menu_icon);
            isSelected = itemView.findViewById(R.id.item_menu_selected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onSideMenuItemClick(getAdapterPosition());
                }
            });
        }
    }
}
