package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        int cp,ci,n ;

        cp=0;
        ci=0;
        for (int i=1; i<=20;i++)
        {
            n=Integer.parseInt(JOptionPane.showInputDialog(args));
            if (n%2==0)
            {
                cp++;

            }
            else
            {
                ci++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+cp +" Numeros pares");
        JOptionPane.showMessageDialog(null, "Hay "+ci +" Numeros impares");

    }
}