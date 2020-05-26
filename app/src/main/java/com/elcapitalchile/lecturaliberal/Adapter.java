package com.elcapitalchile.lecturaliberal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {

    public final Activity context;
    private ArrayList<String> list_name;
    private ArrayList<String> list_pais;
    private ArrayList<String> list_nacimiento;
    private ArrayList<Integer> list_image;
    private ArrayList<Integer> list_image2;



    static class ViewHolder {
        TextView name_text;
        TextView pais_text;
        TextView nacimiento_text;
        ImageView personaje;
        ImageView bandera;


    }




    Adapter(Activity context, ArrayList<String> list_name, ArrayList<String> list_pais, ArrayList<String> list_nacimiento, ArrayList<Integer> list_image, ArrayList<Integer> list_image2) {
        super( context, R.layout.elementolista, list_name);
        this.context = context;

        this.list_name=list_name;
        this.list_pais=list_pais;
        this.list_nacimiento=list_nacimiento;
        this.list_image=list_image;
        this.list_image2=list_image2;




    }
    @NonNull
    @Override
    public View getView(int position, View view, @NonNull ViewGroup parent){
        Adapter.ViewHolder holder = new Adapter.ViewHolder();

        if (view==null){

            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.elementolista,parent,false);

            holder.name_text = view.findViewById( R.id.txt_nombre );
            holder.pais_text = view.findViewById( R.id.txt_pais );
            holder.nacimiento_text = view.findViewById( R.id.txt_nacimiento );
            holder.personaje = view.findViewById( R.id.FotoPersonaje );
            holder.bandera = view.findViewById( R.id.FotoBandera );




            view.setTag( holder );


        } else {


            holder = (Adapter.ViewHolder) view.getTag();
        }

        try{


            holder.name_text.setText(list_name.get(position) );
            holder.pais_text.setText(list_pais.get(position) );
            holder.nacimiento_text.setText(list_nacimiento.get(position) );


            Glide.with(context).load(list_image.get(position)).into(holder.personaje);
            Glide.with(context).load(list_image2.get(position)).into(holder.bandera);

        } catch (Exception ignored){

        }



        return view;


    }

}
