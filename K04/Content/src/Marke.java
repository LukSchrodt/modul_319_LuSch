
public class Marke {
    private String name;
    private Beer[] beers = new Beer[10];

    public void printBeers() {
        if(this.beers.length > 0){
            for(int i = 0; i < this.beers.length; i++){
                Beer beer = this.beers[i];
                System.out.println(beer.getName());
                System.out.println(beer.getSort());
                System.out.println("-------------------------");
            }
        }else{
            System.out.println("Von der Marke " + name + " sind momentan keine Biere vorhanden");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Beer[] getBeers() {
        return beers;
    }

    public void setBeers(Beer[] beers) {
        this.beers = beers;
    }
}
