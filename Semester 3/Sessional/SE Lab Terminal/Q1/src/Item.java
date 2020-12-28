public abstract class Item implements Price {
    public void sell(Object o) {
        System.out.println(o.toString());
    }
}
