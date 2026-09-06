/* BLOCO 1 - Atividade 04
Ficha completa de um personagem de RPG usando diferentes tipos de variáveis,
• Armazene nome, classe, nivel, quantidade de vida, altura, inicial do reino
e se possui item lendário. 
• Utilize pelo menos duas variáveis String, duas int, uma double, uma char 
e uma boolean. 
• Altere o nivel do personagem depois da primeira apresentação e mostre a 
ficha novamente com o novo valor.
*/

public class Main{

  public static void main (String[] args){

   String nome = "Thoph";
   String classe = "Guerreira";
   int nivel = 50;
   int quantidadeVida = 100;
   double altura = 1.60;
   char inicialReino = 'T';
   boolean itemLendario = true; 

   System.out.println("------Ficha Inicial------");
   System.out.println("Nome: " +nome);
   System.out.println("Classe: " +classe);
   System.out.println("Nivel: " +nivel);
   System.out.println("Quantidade de vida: " +quantidadeVida);
   System.out.println("Altura: " +altura);
   System.out.println("Inicial do Reino: " +inicialReino);
   System.out.println("Item Lendário: " +itemLendario);


   nivel = 51; 

   System.out.println("\n------Ficha Atualizada------");
   System.out.println("Nome: " +nome);
   System.out.println("Classe: " +classe);
   System.out.println("Nivel: " +nivel);
   System.out.println("Quantidade de vida: " +quantidadeVida);
   System.out.println("Altura: " +altura);
   System.out.println("Inicial do Reino: " +inicialReino);
   System.out.println("Item Lendário: " +itemLendario);

  } 


}