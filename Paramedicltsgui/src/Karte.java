
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.*;



        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hendr
 */
public class Karte {
    double lon = 0;
    double lat = 0;
    public void abfragen(String Adresse){
    try{
    URL url = new URL("https://nominatim.openstreetmap.org/?addressdetails=1&q="+ Adresse+"&format=json&limit=1");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestProperty("Accept","*/*");
    System.out.println(con.getResponseCode()+" "+con.getResponseMessage());
    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
    String line;
    StringBuilder builder = new StringBuilder();
    while((line = br.readLine()) != null){
        builder.append(line);
    }
    con.disconnect();
    String builderstr = builder.toString();
    System.out.println(builder);
    Object obj = JSONValue.parse(builderstr);
    JSONArray array = (JSONArray)obj;
    JSONObject obj2 = (JSONObject)array.get(0);
    Object olat = obj2.get("lat");
    Object olon = obj2.get("lon");
    lat = new Double(olat.toString());
    lon = new Double(olon.toString());
    }catch(IOException ioe){
        System.out.println("ioeFehler");
    }
    }
    public double getlat(){
        return lat;
    }
    public double getlon(){
        return lon;
    }
}
