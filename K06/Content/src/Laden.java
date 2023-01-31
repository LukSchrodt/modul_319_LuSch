public class Laden {
    Lager lager = new Lager();
    Einkaufswagen ekw = new Einkaufswagen();

    public void getAll(){
        int[] list = lager.getAllByType(choseBeerType());
        ekw.addToCart(list[1]);
    }

    public int choseBeerType(){
        return 3;
    }

}
