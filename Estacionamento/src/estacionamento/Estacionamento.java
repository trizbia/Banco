
package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        Metodos info = new Metodos(); 
        
        info.setNome(JOptionPane.showInputDialog("Digite o nome do proprietário do carro:"));
        info.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro:"));
        info.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
        info.setCor(JOptionPane.showInputDialog("Digite a cor do carro:"));
        info.setHora_entrada(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora da entrada desse carro:")));
        info.setHora_saida(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora da saída desse carro:")));
        info.setMin_entrada(Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos da entrada desse carro:")));
        info.setMin_saida(Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos da saída desse carro:")));
        
        
        info.TempoTotal(info.getHora_entrada(), info.getHora_saida(), info.getMin_entrada(), info.getMin_saida());
        
        
        
    }
    
}
