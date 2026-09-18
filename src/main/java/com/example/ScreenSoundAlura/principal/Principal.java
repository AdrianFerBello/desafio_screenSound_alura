package com.example.ScreenSoundAlura.principal;

import com.example.ScreenSoundAlura.model.Artista;
import com.example.ScreenSoundAlura.model.GeneroMusical;
import com.example.ScreenSoundAlura.model.TipoArtista;
import com.example.ScreenSoundAlura.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {

    boolean rodarMenu = true;

    Scanner leitor = new Scanner(System.in);

    private ArtistaRepository artistaRepository;

    public Principal(ArtistaRepository artistaRepository){
        this.artistaRepository = artistaRepository;
    }

    public void exibirMenu(){
        String menu = """
                ******** ScreenSound **********
                
                1. Cadastrar Artista
                2. Cadastrar Musicas
                3. Listar Musicas
                4. Pesquisar Musicas por Artista
                5. Pesquisar dados sobre um artista
                
                0. SAIR
                
                Digite uma opção para interagir
                """;

        while(rodarMenu){
            System.out.println(menu);

            var opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    consultarArtista(); // arrumar valores nulos no banco
                    break;
                case 2:
                    consultarMusica();
                    break;
                case 3:
                    //listarMusicas();
                    break;
                case 4:
                    //consultarMusicasPorArtista();
                    break;
                case 5:
                    //pesquisarDadosArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    rodarMenu = false;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    private void consultarMusica() {
        System.out.println();
    }

    private void consultarArtista() {

        leitor.nextLine();

        System.out.println("Informe o nome do artista: ");
        var nome = leitor.nextLine();

        System.out.println("Informe o tipo do artista: (solo, dupla, banda)");
        var tipo = leitor.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());

        System.out.println("Informe a categoria Musical do seu artista: (funk, sertanejo, rock)");
        var genero = leitor.nextLine();
        GeneroMusical generoMusical = GeneroMusical.valueOf(genero.toUpperCase());

        Artista artista = new Artista();
        artista.setNome(nome);
        artista.setTipoArtista(tipoArtista);
        artista.setGenero(generoMusical);

        artistaRepository.save(artista);
        System.out.println("Artista salvo no banco de dados");

        System.out.println("Cadastrar outro artista? (S/N)");
        char letra = leitor.next().charAt(0);

        if (letra == 's' || letra == 'S'){
            consultarArtista();
        } else if (letra == 'n' || letra == 'N') {
            System.out.println("Saindo....");
        }
    }
}
