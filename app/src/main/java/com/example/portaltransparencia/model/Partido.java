package com.example.portaltransparencia.model;

public class Partido {
    private long id;
    private String sigla;
    private String nome;
    private String uri;
    private int numeroEleitoral;
    private String urlWebSite;
    private String urlFacebook;

    public Partido() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getNumeroEleitoral() {
        return numeroEleitoral;
    }

    public void setNumeroEleitoral(int numeroEleitoral) {
        this.numeroEleitoral = numeroEleitoral;
    }

    public String getUrlWebSite() {
        return urlWebSite;
    }

    public void setUrlWebSite(String urlWebSite) {
        this.urlWebSite = urlWebSite;
    }

    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }
}
