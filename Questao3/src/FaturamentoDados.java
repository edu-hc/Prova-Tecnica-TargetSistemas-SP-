import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoDados {

    public static void main(String[] args) {

        double valorMaior = 0;
        double valorMenor = 0;
        double media = 0;

        ArrayList <Double> faturamento;

        JSONObject jsonObject;

        JSONParser parser = new JSONParser();

        try {

            FileReader reader = new FileReader("Questao3/src/dados.json");

            int contDiasMedia = 0;
            int contMedia = 0;

            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;
            
            for (Object o : jsonArray) {

                JSONObject registro = (JSONObject) o;

                if((double) registro.get("valor") != 0) {
                    contMedia++;
                }

                media += (double) registro.get("valor");
            }

            media = media / contMedia;

            for (Object o : jsonArray) {

                JSONObject registro = (JSONObject) o;

                if((double) registro.get("valor") == 0 ) {continue;}

                if ((double) registro.get("valor") > media) {

                    contDiasMedia++;
                    
                }

                if(valorMaior < (double) registro.get("valor")) {

                    valorMaior = (double) registro.get("valor");

                }

                if(valorMenor == 0) {

                    valorMenor = (double) registro.get("valor");
                    
                }else if (valorMenor > (double) registro.get("valor")) {

                    valorMenor = (double) registro.get("valor");

                }
                

            }

            System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: R$" + valorMenor);
            System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: R$" + valorMaior);
            System.out.println("O número de dias no mês em que o valor de faturamento diário foi superior à média mensal(" + media + ") foi de: " + contDiasMedia);


            reader.close();
        }

        catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (ParseException e) {

			e.printStackTrace();
		}
        
    }

}
