package com.example.ScreenSoundAlura.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;

public class ConsultaChatGpt {
    private static final OpenAIClient client =
            OpenAIOkHttpClient.fromEnv();

    public String obterInformacoesArtista(String nomeArtista) {

        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .addUserMessage(
                        "Me fale sobre o artista " + nomeArtista +
                                ". Informe brevemente sua história, estilo musical, " +
                                "principais características e músicas conhecidas."
                )
                .model("gpt-4o-mini")
                .build();

        ChatCompletion resposta = client.chat().completions().create(params);

        return resposta.choices().get(0)
                .message()
                .content()
                .orElse("Não foi possível obter informações sobre o artista.");
    }

}
