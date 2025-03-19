public class MusicPlayerClass implements MusicPlayer{
    private String filename;

    MusicPlayerClass(String filename) {
        this.filename = filename;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo musica" + this.filename);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica" + this.filename);
    }

    @Override
    public void parar() {
        System.out.println("Parando a musica" + this.filename);
    }
}
