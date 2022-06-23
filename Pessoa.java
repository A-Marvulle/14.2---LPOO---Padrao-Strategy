public abstract class Pessoa {
  private Arma arma;
  private String nome;
  private String titulo;

  public String getNome(){
    return nome;
  }
  
  public void setNome(String name){
    this.nome = name;    
  }

  public String getTitulo(){
    return titulo;
  }
  public void setTitulo(String cargo){
    this.titulo = cargo;    
  }

  public Arma getArma(){
    return arma;
  }
  public void setArma(Arma weapon){
    this.arma = weapon;    
  }
  


  public void mudarArma(Arma arma) {
    this.arma = arma;
  }

  public abstract void combater();

}
