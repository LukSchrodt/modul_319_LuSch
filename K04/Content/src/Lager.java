
public class Lager {
    private String name;
    private Marke[] marken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marke[] getMarken() {
        return marken;
    }

    public void setMarken(Marke[] marken) {
        this.marken = marken;
    }

    public void printMarken(){
        if(this.marken.length > 0) {
            for (int i = 0; i < this.marken.length; i++) {
                Marke marke = this.marken[i];
                System.out.println("#############################");
                System.out.println(marke.getName() + ":");
                marke.printBeers();
            }
        }else{
            System.out.println(this.name + "lager ist momentan leer");
        }
        System.out.println("#############################");
    }

    /* private Beer[] lagerBeer = {new Beer("Heineken", Sort.LAGER), new Beer("Calanda", Sort.LAGER), new Beer("Chopfab", Sort.LAGER)};
    private Beer[] amberBeer = {new Beer("Ittinger", Sort.AMBER), new Beer("Chopfab Amber",Sort.AMBER), new Beer("Grimbergen Amber", Sort.AMBER), new Beer("Berner muentschi", Sort.AMBER)};
    private Beer[] darkBeer = {new Beer("Schwarzer Kristall", Sort.DARK), new Beer("Chopfab Dunkel", Sort.DARK)};
    private Beer[] stoutBeer = {new Beer("Guinness", Sort.STOUT)};
    private Beer[] aleBeer = {};

    public Lager() {
    }


    public Beer[] getLagerBeer() {
        return lagerBeer;
    }

    public void setLagerBeer(Beer[] lagerBeer) {
        this.lagerBeer = lagerBeer;
    }

    public Beer[] getAmberBeer() {
        return amberBeer;
    }

    public void setAmberBeer(Beer[] amberBeer) {
        this.amberBeer = amberBeer;
    }

    public Beer[] getDarkBeer() {
        return darkBeer;
    }

    public void setDarkBeer(Beer[] darkBeer) {
        this.darkBeer = darkBeer;
    }

    public Beer[] getStoutBeer() {
        return stoutBeer;
    }

    public void setStoutBeer(Beer[] stoutBeer) {
        this.stoutBeer = stoutBeer;
    }

    public Beer[] getAleBeer() {
        return aleBeer;
    }

    public void setAleBeer(Beer[] aleBeer) {
        this.aleBeer = aleBeer;
    }*/
}
