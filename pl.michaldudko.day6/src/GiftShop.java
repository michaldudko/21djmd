public class GiftShop {
    public static void main(String [] args){
        Storefront store = new Storefront();
        store.addItem("C01","KUBEK","9.99","150",true);
        store.addItem("C02", "DUŻY KUBEK","12.99","82",true);
        store.addItem("C03","PODKŁADKA","10.49","800",false);
        store.addItem("D01", "KOSZULKA","16.99","90",true);
        store.sort();

        for (int i = 0; i < store.getSize();i++){
            Item show = (Item) store.getItem(i);
            System.out.println("\nIdentyfikator elementu: "+show.getId()+
                    "\nNazwa: "+ show.getName()+
                    "\nCena detaliczna: "+show.getRetail()+"zł"+
                    "\nCena: "+ show.getPrice()+"zł"+
                    "\nSztuk: "+show.getQuantity());

        }
    }
}
