public record WebBrowserRecord(String website) implements WebBrowser{

    @Override
    public void openWebsite() {
        System.out.println("Abrindo website " + this.website);
    }

    @Override
    public void closeWebsite() {
        System.out.println("Fechando website " + this.website);
    }
}
