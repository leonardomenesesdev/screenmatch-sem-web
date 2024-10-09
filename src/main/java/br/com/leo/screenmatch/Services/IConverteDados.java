package br.com.leo.screenmatch.Services;

public interface IConverteDados {
     <T> T obterDados(String json, Class<T> classe);
}
