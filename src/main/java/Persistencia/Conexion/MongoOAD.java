package Persistencia.Conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Collation;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class MongoOAD {
    private static MongoOAD instancia;
    private final MongoClient mongoClient;
    private final MongoDatabase db;

    private MongoOAD() {
        String url = "mongodb://127.0.01:27017";
        this.mongoClient = MongoClients.create(url);
        this.db = MongoClients.create(url).getDatabase("bd2");
    }

    public static MongoOAD obtenerInstancia(){
        if(instancia == null)
            instancia = new MongoOAD();
        return instancia;
    }

    public MongoDatabase obtenerDb() {
        return this.db;
    }

    public void seedearDb() {
        // Insertar usuarios
    }

//    public MongoDatabase obtenerConexion(String database) throws Error {
//        try {
//            return mongoClient.getDatabase(database);
//        }
//        catch (Exception e) {
//            throw new Error("Error ene la coneccxion a MongoDB");
//        }
//    }
}
