public class app {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Diego");
        Estudante e = new Estudante("Roberta", 12545);
        Pessoa p2 = new Estudante("Marcos", 222 );
           /*
            *  p.setNome("Diego");
              e.setNome("Roberta");   e.setRa(12545);
            */
       
     
        System.out.println(p.getNome());
        System.out.println(e.getNome() + " - " + e.getRa());

        System.out.println(p); //chama automaticamente o toString
        System.out.println(e); 
        System.out.println(p2);
    }
}
