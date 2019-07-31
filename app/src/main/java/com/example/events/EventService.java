package com.example.events;


import com.example.events.models.Event;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EventService {
    public static void findEvents(String location, Callback callback){
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.EVENT_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.EVENT_LOCATION_QUERY_PARAMETER,location);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization","Bearer " + Constants.EVENT_TOKEN)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }
    public static ArrayList<Event> processResults(Response response){
        ArrayList<Event> eventss = new ArrayList<>();
        Gson gson = new Gson();
        try{
            String data = response.body().string();
            JSONObject dataJson = new JSONObject(data);
            JSONArray eventArray = dataJson.getJSONArray("events");
            if (response.isSuccessful()){
                Type listTYpe = new TypeToken<List<Event>>() {}.getType();
                eventss = gson.fromJson(eventArray.toString(),listTYpe);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return eventss;
    }

}
