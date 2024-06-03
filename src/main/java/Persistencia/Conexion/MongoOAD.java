package Persistencia.Conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoOAD {
    private static MongoOAD instancia;
    private final MongoClient mongoClient;

    private MongoOAD() {
        String url = "mongodb://127.0.01:27017";
        mongoClient = MongoClients.create(url);
    }

    public static MongoOAD obtenerInstancia(){
        if(instancia == null)
            instancia = new MongoOAD();
        return instancia;
    }

    public MongoDatabase obtenerConexion(String database) throws Error {
        try {
            return mongoClient.getDatabase(database);
        }
        catch (Exception e) {
            throw new Error("Error ene la coneccxion a MongoDB");
        }
    }

    public get() {

    }
}