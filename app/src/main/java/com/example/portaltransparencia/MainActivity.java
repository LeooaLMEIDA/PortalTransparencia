package com.example.portaltransparencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.portaltransparencia.controller.DeputadoController;
import com.example.portaltransparencia.model.dto.DeputadoDTO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btVisualizarGastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btVisualizarGastos = findViewById(R.id.btVisualizarGastos);
        btVisualizarGastos.setOnClickListener(view -> visualizarGastos());

        DeputadoController.getDeputadoDto(this, new DeputadoController.DeputadoCallback() {
            @Override
            public void onDeputadoDtoReceived(DeputadoDTO deputadoDto) {

                listaDeputados = new ArrayList<>();

                listaDeputados.addAll(deputadoDto.getDados());
            }

            @Override
            public void onDeputadoError(String errorMessage) {
                Log.e("Deputado Error", errorMessage);
            }
        });

    }

    public void abrirActivityListagem(){
        Intent intent = new Intent(MainActivity.this,
                ListagemActivity.class);

        startActivity(intent);
    }

    private void visualizarGastos() {
    }
}