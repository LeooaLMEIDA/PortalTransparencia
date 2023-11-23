package com.example.portaltransparencia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.portaltransparencia.R;
import com.example.portaltransparencia.model.Deputado;

import java.util.ArrayList;

public class DeputadoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Deputado> lista;

    public Context getContext() {
        return context;
    }

    public ArrayList<Deputado> getLista() {
        return lista;
    }

    public DeputadoAdapter(Context context, ArrayList<Deputado> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
