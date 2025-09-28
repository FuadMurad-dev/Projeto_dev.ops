package json;

import information.Game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonService {

    Gson gson;
    private final String  json_nome = "games.json";

    public JsonService(){
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    public String convertToJson(List<Game> games){
        return gson.toJson(games);
    }

    public void  saveJson(String json)
    {
        try (FileWriter writer = new FileWriter(json_nome))
        {
            writer.write(json);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
