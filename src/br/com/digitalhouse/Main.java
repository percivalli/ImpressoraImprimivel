package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        Contrato contrato = new Contrato("Contrato.", "docx");
        Foto foto = new Foto("Foto.", "jpg");
        Documento documento = new Documento("Documento.", "docx");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.imprimirTudo();


    }


}
