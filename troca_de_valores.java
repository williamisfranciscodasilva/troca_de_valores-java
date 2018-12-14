import javax.swing.JOptionPane;
class troca_de_valores
{
   public static void main(String args[])
   {
      int a, b, c;

      a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
      b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

      System.out.println("O valor digitado de A foi: "+a+ " E o valor digitado de B foi: "+b);
      JOptionPane.showMessageDialog(null,"O valor digitado de A foi: "+a+ " E o valor digitado de B foi: "+b);

      c = a;
      a = b;
      b = c;

     System.out.println("Agora A vale:: "+a);
     System.out.println("Agora B vale:: "+b);
     JOptionPane.showMessageDialog(null,"Agora A vale:: "+a+
      "\nAgora B vale: "+b);
   }
}