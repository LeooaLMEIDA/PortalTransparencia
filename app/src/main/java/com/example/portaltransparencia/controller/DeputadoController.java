package com.example.portaltransparencia.controller;

import com.example.portaltransparencia.model.dto.DeputadoDTO;

public class DeputadoController {

    public interface DeputadoRetornoAPI {
        void deputadoRetornoDto(DeputadoDTO deputadoDTO);
        void deputadoError(String errorMessage);
    }

    public interface DespesaRetornoAPI {
        void despesaRetornoDto(DeputadoDTO deputadoDTO);
        void despesaError(String errorMessage);
    }

}
