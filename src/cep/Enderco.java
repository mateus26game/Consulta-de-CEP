package cep;

public class Enderco {

    private  String uf;
    private String cidade;
    private String bairro;
    private String logradouro;
    private  String tipo_logradouro;


    public String getUf() {
        return uf;
    }

    public void  setUf(String uf){
        this.uf = uf;
    }


    public String getCidade(){
        return  cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public  String getBairro(){
        return  bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }



    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipo_logradouro() {
        return tipo_logradouro;
    }

    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

    @Override
    public String toString() {
        return " ------------------------------ Endereço  ------------------------------              \n" +
                "UF = " + uf + "\n" +
                "Cidade = " + cidade + "\n" +
                "Bairro = " + bairro + "\n" +
                "Logradouro = " + tipo_logradouro + " " + logradouro + "\n" +
                "-----------------------------------------------------------------------------              ";
    }



}
