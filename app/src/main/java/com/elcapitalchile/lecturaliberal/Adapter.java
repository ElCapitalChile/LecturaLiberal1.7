package com.elcapitalchile.lecturaliberal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {

    public final Activity context;
    public ArrayList<String> list_name= new ArrayList<>();
    public ArrayList<String> list_pais= new ArrayList<>();
    public ArrayList<String> list_nacimiento= new ArrayList<>();
    public ArrayList<Integer> list_image= new ArrayList<>();
    public ArrayList<Integer> list_image2= new ArrayList<>();



    static class ViewHolder {
        TextView name_text;
        TextView pais_text;
        TextView nacimiento_text;
        ImageView personaje;
        ImageView bandera;


        int position;
    }




    public Adapter(Activity context, ArrayList<String> list_name, ArrayList<String> list_pais,ArrayList<String> list_nacimiento, ArrayList<Integer> list_image,ArrayList<Integer> list_image2) {
        super( context, R.layout.elementolista, list_name);
        this.context = context;

        this.list_name=list_name;
        this.list_pais=list_pais;
        this.list_nacimiento=list_nacimiento;
        this.list_image=list_image;
        this.list_image2=list_image2;




    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        Adapter.ViewHolder holder = new Adapter.ViewHolder();

        if (view==null){

            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.elementolista,parent,false);

            holder.name_text = (TextView) view.findViewById( R.id.txt_nombre );
            holder.pais_text = (TextView) view.findViewById( R.id.txt_pais );
            holder.nacimiento_text = (TextView) view.findViewById( R.id.txt_nacimiento );
            holder.personaje = (ImageView) view.findViewById( R.id.FotoPersonaje );
            holder.bandera = (ImageView) view.findViewById( R.id.FotoBandera );




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

        } catch (Exception e){

        }



        return view;


    }

}
