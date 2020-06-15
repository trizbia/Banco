
package contadeluz;

import javax.swing.JOptionPane;

public class Contadeluz {

    public static void main(String[] args) {
        
         Operacoes dados = new Operacoes(); 
        
          dados.setNome(JOptionPane.showInputDialog("Digite o nome do titular da conta: "));
          dados.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP do titular da conta: ")));
          dados.setLeitura_anterior(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura realiazada anteriormente em vW: ")));
          dados.setLeitura_atual(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atualem vW")));
          
          //-----------------------------------------------------------------------------------------------------------------------------------------------//
          
          dados.vLeitura(dados.getLeitura_atual(), dados.getLeitura_anterior(), dados.getGasto());
          dados.cal_sembandeira(dados.getTUSD(), dados.getTE(), dados.getICMS(), dados.getGasto(), dados.getParte_total());
          dados.cal_combandeira(dados.getGasto(), dados.getParte_total(), dados.getTotal());
          dados.Informacoes();
   
    
    }
    
}
