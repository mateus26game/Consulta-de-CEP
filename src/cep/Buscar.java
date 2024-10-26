package cep;

import com.google.gson.Gson;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscar {
    public static void main(String[] args) throws IOException, InterruptedException {
        String cep;

        while (true) {
            // Solicita o CEP ao usuário usando JOptionPane
            cep = JOptionPane.showInputDialog(null, "Digite um CEP a ser buscado (8 dígitos):", "Consulta de CEP", JOptionPane.PLAIN_MESSAGE);

            // Verifica se o usuário clicou em "Cancelar" ou deixou em branco
            if (cep == null || cep.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;  // Encerra o programa se o usuário cancelar
            }

            // Verifica se o CEP tem o formato correto de 8 dígitos
            if (cep.matches("\\d{8}")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Formato de CEP inválido. Digite exatamente 8 dígitos.");
            }
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=json"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        Enderco endereco = gson.fromJson(json, Enderco.class);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Resultado da busca:\n" + endereco.toString(), "Informações do CEP", JOptionPane.INFORMATION_MESSAGE);
    }
}
