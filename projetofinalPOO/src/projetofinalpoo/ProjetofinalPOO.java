/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author luisg
 */
public class ProjetofinalPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0]= new Video("Programação orientada a objeto | Aula 0 - JAVA");
        v[1]= new Video("Programação orientada a objeto | Aula 1 - JAVA");
        v[2]= new Video("Programação orientada a objeto | Aula 2 - JAVA");
        
        Aluno a[] = new Aluno[1];
        a[0] = new Aluno("SanteLGG" ,"Sante", 22, "M");
        
        Visualizacao visu[]= new Visualizacao[3];
        
        visu[0] = new Visualizacao(a[0], v[0]); //Sante Aula 0
        visu[0].avaliar(2);
        System.out.println(visu[0].toString());
        
        visu[1] = new Visualizacao(a[0], v[1]); //Sante aula 1
        visu[1].avaliar(43.3f);
        System.out.println(visu[1].toString());
        
        visu[2] = new Visualizacao(a[0], v[2]); //Sante aula 2
        visu[2].avaliar(86.0f);
        System.out.println(visu[2].toString());
        
        
    }
    
}
