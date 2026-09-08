public class Perro extends Canido {

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívora";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }
}