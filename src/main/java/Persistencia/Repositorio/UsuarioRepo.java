package Persistencia.Repositorio;

import Logica.Producto;
import Logica.Usuario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepo {
    private MongoCollection<Document> users;

    public UsuarioRepo(MongoDatabase db) {
        this.users = db.getCollection("users");
    }

    public Usuario getUserById(String id) {
        Document result = this.users.find(Filters.eq("_id", new ObjectId(id))).first();
        if(result == null || result.isEmpty()) throw new Error("Usuario inexistente");
        return Usuario.fromDocument(result);
    }

    public String insertUser(Usuario usuario) {
        Document doc = new Document();
        doc.append("correo", usuario.getCorreo());
        doc.append("contraseña", usuario.getContraseña());
        doc.append("nombre", usuario.getNombre());
        doc.append("dni", usuario.getDni());
        doc.append("direccion", usuario.getDireccion());
        this.users.insertOne(doc);
        return doc.getObjectId("_id").toString();
    }

    public Usuario[] getAllUsers() {
        List<Document> result = this.users.find().into(new ArrayList<>());
        return result.stream().map(Usuario::fromDocument).toArray(Usuario[]::new);
    }

    public void seedearCollection() {
        this.users.drop();
        insertUser(new Usuario(null, "1@2.com", "1234", "Julian Benitez", 4299934, "Test 1"));
        insertUser(new Usuario(null, "1@3.com", "1234", "Nico Benitez", 4999345, "Test 2"));
        insertUser(new Usuario(null, "1@4.com", "1234", "Julian Tucci", 4299345, "Test 3"));
        insertUser(new Usuario(null, "1@5.com", "1234", "Nico Tucci", 4299935, "Test 4"));
        System.out.println("Usuarios :: Seeded");
    }
}
