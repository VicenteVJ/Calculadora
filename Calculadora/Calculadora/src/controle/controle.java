package controle;

import Operacoes.EnumOperacao;

public class controle {
    private Double total;

    public controle() {
        total = 0.0;
    }

    public void realizarSoma(double numero) {
    total += numero;
    }
    
    public void realizarSubtracao(double numero) {
    total -= numero;
    }

    public void realizarMultiplicacao(double numero) {
    total *= numero;
    }

    public void realizarDivisao(double numero) {
        if (numero != 0) {
            total /= numero;
        } else {
        // Lógica para lidar com a divisão por zero, se necessário
        }
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        total =0.0;
    }
    
    
}
