public record CallRecord(String numero) implements Call{
    @Override
    public void ligar() {
        System.out.println("Ligando para " + this.numero);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando chamada");
    }
}
