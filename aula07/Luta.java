package aula07;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    /* Regras:
    Só pode ser marcada entre lutadores da mesma categoria
    Desafiado e desafiante devem ser lutadores diferentes
    Só pode acontecer se estiver aprovada
    */
    public void marcarluta(Lutador l1, Lutador l2){
        
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
           
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatory = new Random();
            int vencedor = aleatory.nextInt(3);
                               
            System.out.println("---- Resultado ----");
            switch(vencedor){
                case 0:
                    System.out.println("      Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                    case 1:
                    System.out.println(this.desafiado.getNome() + " Wins!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println(this.desafiante.getNome() + " Wins!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("-------------------");
        } else {
            System.out.println("A luta não pode acontecer.");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    
    
}
