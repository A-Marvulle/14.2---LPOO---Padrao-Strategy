public class Rainha extends Pessoa {
  public void combater(){
    System.out.print(getNome() + ", " + getTitulo() + " atacou com ");
    getArma().executar();
  }

}