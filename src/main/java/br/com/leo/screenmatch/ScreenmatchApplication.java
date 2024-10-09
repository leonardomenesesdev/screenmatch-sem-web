package br.com.leo.screenmatch;

import br.com.leo.screenmatch.Services.ConsumoApi;
import br.com.leo.screenmatch.Services.ConverteDados;
import br.com.leo.screenmatch.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json =  consumoApi.ObterDados("https://omdbapi.com/?t=how+i+met+your+mother&apikey=93e6e1ab");
		System.out.println(json);
		System.out.println("==========================");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
