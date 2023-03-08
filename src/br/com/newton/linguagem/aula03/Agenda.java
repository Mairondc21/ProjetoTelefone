package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Contato contato = new Contato();

        telefone.contato = contato;
        //contato.nome = "Mairon";
        contato.telefone = "2221554";

        Telefone tel1 = new Telefone();

        tel1.cont2.nome = "Jaoa";
        tel1.cont2.telefone = "3189871147";
        tel1.cor = "preto";
        tel1.marca = "Iphone";
        //tel1.setTocar("pagode");

        Telefone tel2 = new Telefone();

        tel2.cont3.nome = "Carmen";
        tel2.cont3.telefone = "318989952";
        tel2.cor = "Branco";
        tel2.marca = "s20";
        //tel2.Tocar("Funk");

        System.out.println(tel1.cont2.nome);
        System.out.println(tel1.cor);
        
    }
}
