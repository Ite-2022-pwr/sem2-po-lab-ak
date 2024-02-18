import java.util.*;

public class Shop {

    public static void main(String[] args) {
        Item itemBlad = new Item();
        System.out.println(itemBlad);
        itemBlad.printFields();

        Item itemPomidor = new Item("pomidor", 3, Category.Fruits, 20, 4, 2023);
        System.out.println(itemPomidor);
        itemPomidor.printFields();

        Item itemPomidorGalazka = new Item(itemPomidor);
        System.out.println(itemPomidorGalazka);
        itemPomidorGalazka.printFields();

        Item[] items = new Item[3];

        System.out.println(Arrays.toString(items));

        Arrays.fill(items, new Item());

        System.out.println(Arrays.toString(items));

        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(itemBlad);
        itemsList.add(itemPomidor);
        itemsList.add(itemPomidorGalazka);

        System.out.println(itemsList);

        System.out.println("countStatic_ = " + Item.getCount());
        //System.out.println("countNonStatic_ = " + itemPomidorGalazka.countNonStatic_);
        //System.out.println("idStatic_ = " + Item.idStatic_);
        System.out.println("idNonStatic_ = " + itemPomidor.getId());
    }
}