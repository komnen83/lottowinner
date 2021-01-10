package pl.sda;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pl.sda.model.Games;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        //http://serwis.mobilotto.pl/mapi_v7/index.php?json=getGames
        //http://api.open-notify.org/iss-now.json
        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient();


        Request request = new Request.Builder()
                .url("http://serwis.mobilotto.pl/mapi_v7/index.php?json=getGames")
                .build();

        Response response = client.newCall(request).execute();
        String stringResponse = response.body().string();

        Games dataLotto = gson.fromJson(stringResponse, Games.class);

        System.out.println(dataLotto.getLotto());
        System.out.println(dataLotto.getMini());
    }
}

