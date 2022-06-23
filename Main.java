class Main {
  public static void main(String[] args) {

    Rei rei = new Rei();
    Rainha rainha = new Rainha();
    Bobo bobo = new Bobo();
    Monster monstro = new Monster();
    
    rei.setNome("Admir");
    rei.setTitulo("Rei");

    rainha.setNome("Admira");
    rainha.setTitulo("Rainha");

    bobo.setNome("Bob");
    bobo.setTitulo("Bobo da Corte");

    monstro.setNome("*****"); 
    monstro.setTitulo("*******");
        
    rei.mudarArma(new Machado());
    rei.combater();

    rainha.mudarArma(new Cajado());
    rainha.combater();
    
    bobo.mudarArma(new Faca());
    bobo.combater();

    monstro.mudarArma(new Espada());
    monstro.combater();
    
  }
}