
package contadeluz;

import javax.swing.JOptionPane;

public class Operacoes {
    public String nome;
    public int cep;
    public double leitura_anterior, leitura_atual;
    public double TUSD, TE, ICMS, gasto, parte_total, total;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getLeitura_anterior() {
        return leitura_anterior;
    }

    public void setLeitura_anterior(double leitura_anterior) {
        this.leitura_anterior = leitura_anterior;
    }

    public double getLeitura_atual() {
        return leitura_atual;
    }

    public void setLeitura_atual(double leitura_atual) {
        this.leitura_atual = leitura_atual;
    }

    public double getTUSD() {
        return TUSD;
    }

    public void setTUSD(double TUSD) {
        this.TUSD = TUSD;
    }

    public double getTE() {
        return TE;
    }

    public void setTE(double TE) {
        this.TE = TE;
    }

    public double getICMS() {
        return ICMS;
    }

    public void setICMS(double ICMS) {
        this.ICMS = ICMS;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     public double getParte_total() {
        return total;
    }

    public void setParte_total(double total) {
        this.total = total;
    }
    
    //----------------------------------------------------------------------//
    
    
public double vLeitura(double leitura_atual, double leitura_anterior, double gasto){
        
         this.gasto = leitura_atual - leitura_anterior;
        
        return gasto;        
    }
    
    public double cal_sembandeira(double TUSD, double TE, double ICMS, double gasto, double total){
       
        TUSD = gasto * 0.30;
        TE = gasto * 0.29;   
        ICMS = (TUSD+TE)*0.25;
        
        this.total= TUSD + TE + (TUSD+TE)*0.25;  
        
        return total;
    }
    
    public double cal_combandeira( double gasto, double parte_total, double total){
        
        double bandeira;
        
        if (gasto<=100){
            // Bandeira Verde
            bandeira=0; 
        } 
        
        else if(gasto>=101 && gasto<=150) {
            //Bandeira Amarela
            bandeira= 0.013;            
        } 
        
        else if (gasto>=150 && gasto<=200){
            bandeira= 0.042;
            //Bandeira Vermelha 1
        } 
        
        else{
            bandeira= 0.06;
            //Bandeira Vermelha 2
        }
        
        
      double calcula_bandeira = (gasto * bandeira) * 0.25 + (gasto*bandeira);
      this.total= calcula_bandeira + parte_total;       
               
        return total;        
    }
    
    public void Informacoes(){
        
         JOptionPane.showMessageDialog(null, "Proprietário: "+ nome + "\n"
            + "CEP: " + cep + "\n"
            + "Leitura anterior: " + getLeitura_anterior()+ "\n"
            + "Leitura Atual : " + getLeitura_atual() + "\n" 
            + "Gasto de energia: " + getGasto() + " kW" +"\n"
            + "Preço total: R$" + getTotal());    
        
        
        
        
        
    }
    
    
    
    
}