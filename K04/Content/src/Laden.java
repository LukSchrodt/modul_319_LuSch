
public class Laden {
    private String name;

    Lager lager = new Lager();

    public void printLager(){
        System.out.println(name + ":");
        if(this.lager.length > 0){
            for(int i = 0; i < this.lager.length; i++){
                Lager thisLager = this.lager[i];
                thisLager.printMarken();
            }
        }else{
            System.out.println("Zurzeit haben wir kein Lager");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lager[] getLager() {
        return lager;
    }

    public void setLager(Lager[] lager) {
        this.lager = lager;
    }

}
