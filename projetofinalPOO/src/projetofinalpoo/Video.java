/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author luisg
 */
public class Video implements Interface {
    private String titulo;
    private int Avaliação;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.Avaliação = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    //getters and setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliação() {
        return Avaliação;
    }
    public void setAvaliação(int Avaliação) {
        int nova;
        nova = ((this.Avaliação + Avaliação)/this.views);
        this.Avaliação = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //metotods implementados
    @Override
    public void play() {
    }
    @Override
    public void pouse() {
    }
    @Override
    public void like() {
    }
    @Override
    public void dislike() {
    }

    @Override
    public String toString() {
        return "\nTitulo= " + titulo + "\nAvalia\u00e7\u00e3o=" + Avaliação + "\nViews=" + views + "\nCurtidas=" + curtidas + "\nReproduzindo=" + reproduzindo  + "\n" ;
    }
}
