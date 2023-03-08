package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;
    Contato cont2 = new Contato();
    Contato cont3 = new Contato();
    public String marca;
    public String cor;


   public void tocar (String musica){
        System.out.println("tocando" + musica);
   }

}
