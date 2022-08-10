/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author luisg
 */
public class Aluno extends Pessoa{
    private String login;
    private int totAssistido;
    
    //construtor

    public Aluno(String login, String name, int idade, String sexo) {
        super(name, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }    
    
    //getters and setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLogin= " + login + "\nTotal de vídeos assistido= " + totAssistido + "\n";
    }
    
    
}
