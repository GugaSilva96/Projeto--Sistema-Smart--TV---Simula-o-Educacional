Projeto "Sistema Smart TV" - Simulação Educacional
Este projeto consiste em uma simulação educacional de um sistema de controle para uma Smart TV. Por meio de duas classes, SmarTv e Usuario, exploraremos interativamente as funcionalidades de ligar/desligar, trocar de canal e ajustar o volume da Smart TV.

Observação Importante: Este é um projeto fictício criado com fins educativos e lúdicos. As classes e interações são simplificadas para facilitar o entendimento e a prática de conceitos de programação em Java.

Classe SmarTv:
java
Copy code
public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
Classe Usuario:
java
Copy code
public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criar uma instância de SmarTv
        SmarTv smarTv = new SmarTv();

        // Interagir com a Smart TV
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

        smarTv.ligar();
        System.out.println("Status: TV ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status: TV ligada? " + smarTv.ligada);
    }
}
Saída do Código
A seguir está a saída do código, passo a passo, conforme o usuário interage com a Smart TV:

yaml
Copy code
TV ligada? false
Novo Status: TV ligada? true
Em qual volume? 25
Diminuindo volume para: 24
Diminuindo volume para: 23
Diminuindo volume para: 22
Aumentando volume para: 23
Volume Atual: 23
TV ligada? true
Qual o canal? 1
Status Canal: 13
Em qual volume? 23
Status: TV ligada? true
Novo Status: TV ligada? false
Este projeto visa proporcionar uma experiência interativa e prática para entender como as classes SmarTv e Usuario interagem no contexto de um sistema de controle de Smart TV. Sinta-se à vontade para explorar e ajustar o código conforme necessário para aprimorar suas habilidades de programação em Java.
