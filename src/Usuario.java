public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criar uma instância de SmarTv
        SmarTv smarTv = new SmarTv();
        
        System.out.println("TV ligada? " + smarTv.ligada);

        smarTv.ligar();
        System.out.println("Novo Status: TV ligada? " + smarTv.ligada);

        System.out.println("Em qual volume? " + smarTv.volume);


        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();
        
        System.out.println("Volume Atual: " + smarTv.volume);


        // Acessar os membros da instância de SmarTv
        System.out.println("TV ligada? " + smarTv.ligada);
        System.out.println("Qual o canal? " + smarTv.canal);

        smarTv.mudarCanal(13);
        System.out.println("Status Canal: " + smarTv.canal);


        System.out.println("Em qual volume? " + smarTv.volume);
    
        smarTv.ligar ();
        System.out.println("Status: TV ligada? " + smarTv.ligada);


        smarTv.desligar();
        System.out.println("Novo Status: TV ligada? " + smarTv.ligada);
    
    }
}

