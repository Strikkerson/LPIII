import javax.swing.JOptionPane;
        
public class Calculadora {
    public static void main(String[] args) {
        String option = 
                JOptionPane.showInputDialog("Escolha a operação desejada:\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
        String firstNumber =
                JOptionPane.showInputDialog("Digite o primeiro número: ");
        String secondNumber =
                JOptionPane.showInputDialog("Digite o segundo número: ");
        
        int optionNum = Integer.parseInt(option);
        double num1 = Integer.parseInt(firstNumber);
        double num2 = Integer.parseInt(secondNumber);
        
        double result = 0;
        switch(optionNum){
            case 1:
                result = num1+num2;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num1*num2;
                break;
            case 4:
                result = num1/num2;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + result, "Resultado da Operação", JOptionPane.PLAIN_MESSAGE);
    }
    
}
