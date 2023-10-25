public class Estudante extends Pessoa {
    
       private int ra;

        public Estudante(String nome, int ra){
            super(nome);
            this.ra=ra;
        }
      
    public int getRa() {
        return ra;
    }


    public void setRa(int ra) {
        this.ra = ra;
    } 

    public String toString(){
        return "Estudante: " + getNome() + " - " + ra;
    }
       
    
}
