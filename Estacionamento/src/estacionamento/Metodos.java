
package estacionamento;

import javax.swing.JOptionPane;

public class Metodos {
    public String placa;
    public String modelo;
    public String cor;
    public String nome;
    public int hora_entrada;
    public int hora_saida;
    public int min_entrada;
    public int min_saida;
    public double preco;
    public int tempo;
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(int hora_saida) {
        this.hora_saida = hora_saida;
    }

    public int getMin_entrada() {
        return min_entrada;
    }

    public void setMin_entrada(int min_entrada) {
        this.min_entrada = min_entrada;
    }

    public int getMin_saida() {
        return min_saida;
    }

    public void setMin_saida(int min_saida) {
        this.min_saida = min_saida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
    public void TempoTotal(int hora_entrada, int hora_saida, int min_entrada, int min_saida){
        if (hora_entrada==hora_saida){
            this.tempo=1;
    }
        else{
        double entrada = hora_entrada + min_entrada/60;
        double saida = hora_saida + min_saida/60;
        
        this.tempo = (int) Math.ceil(saida-entrada);
        
        }
        PrecoTotal(tempo);
    }
    
    
    public void PrecoTotal (int tempo){
        this.preco = tempo*4;
        ficha();
    }
    

    public void ficha(){
        JOptionPane.showMessageDialog(null, "Proprietário:" + getNome() + "\n"    
                + "Placa do Carro: " + getPlaca() + "\n"
                + "Cor do Carro: " + getCor() + "\n"
                + "Modelo do carrp: " + getModelo() + "\n"
                + "Hora da entrada: " + getHora_entrada() + "h" + getMin_entrada() + "min \n"
                + "Hora da saída: " + getHora_saida() + "h" + getMin_saida() + "min \n"
                + "Tempo: " + getTempo() + "h \n"
                + "Preço: R$" + getPreco());
    }

}