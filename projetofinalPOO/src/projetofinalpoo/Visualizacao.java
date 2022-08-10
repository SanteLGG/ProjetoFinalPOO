/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author luisg
 */
public class Visualizacao {
    private Aluno espectador;
    private Video filme;
    
    //construtor
    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //metodos
    public void avaliar(){
        this.filme.setAvaliação(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliação(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliação(tot);
    }
    
    //getters and setters
    public Aluno getEspectador() {
        return espectador;
    }
    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacoes do video" + "\nespectador= " + espectador + "\nFilme= " + filme;
    }   
}
