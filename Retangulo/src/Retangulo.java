public class Retangulo {

    public double largura;
    public double altura;

    public double area(){
        double area = largura * altura;
        return area;
    }
    public double perimetro(){
        double perimetro = (largura + altura) * 2;
        return perimetro;
    }
    public double diagonal(){
        double diagonal = Math.sqrt(largura * largura + altura * altura);
        return diagonal;
    }



}
