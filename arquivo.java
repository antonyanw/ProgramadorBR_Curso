import javax.swing.JOptionPane;

public class FluxoDeDados {
    public static void main(String[] args) {
        // Declaração de variáveis inteiras, reais e String
        int numero1, numero2;
        double quociente;
        double potencia;
        
        // Recebe dois números inteiros do usuário
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        // Cálculo do quociente da divisão (verificação para evitar divisão por zero)
        if (numero2 != 0) {
            quociente = (double) numero1 / numero2; // Realiza a divisão e converte para real (double)
        } else {
            quociente = Double.NaN; // Se o denominador for zero, define o quociente como "Não é um Número" (NaN)
        }
        
        // Cálculo da potência do primeiro número pelo segundo
        potencia = Math.pow(numero1, numero2);
        
        // Exibição das informações
        String mensagem = "Resultados:\n" +
                          "Primeiro número: " + numero1 + "\n" +
                          "Segundo número: " + numero2 + "\n" +
                          "Quociente (divisão do primeiro pelo segundo): " + (numero2 != 0 ? quociente : "Indefinido (divisão por zero)") + "\n" +
                          "Potência (primeiro elevado ao segundo): " + potencia;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
